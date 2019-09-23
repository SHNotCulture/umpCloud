package com.ump.service.impl;

import com.ump.dao.TAlarmLevelMapper;
import com.ump.entity.TAlarmLevel;
import com.ump.entity.TAlarmLevelCriteria;
import com.ump.service.AlarmLevelService;
import com.ump.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmLevelServiceImpl implements AlarmLevelService {
    @Autowired
    private TAlarmLevelMapper tAlarmLevelMapper;

    //设置查询条件
    public TAlarmLevelCriteria getTAlarmLevelCriteria (TAlarmLevel tAlarmLevel){
        TAlarmLevelCriteria tAlarmLevelCriteria = new TAlarmLevelCriteria();
        TAlarmLevelCriteria.Criteria criteria = tAlarmLevelCriteria.createCriteria();
        if (tAlarmLevel!=null){

            if (tAlarmLevel.getLevel()!=null){
                criteria.andLevelEqualTo(tAlarmLevel.getLevel());
            }
            if (tAlarmLevel.getUrl()!=null && tAlarmLevel.getUrl()!=""){
                criteria.andUrlLike("%" + tAlarmLevel.getUrl() + "%");
            }
        }
        return tAlarmLevelCriteria;
    }

    /**
     * 获取数据总量
     * @param tAlarmLevel
     * @param
     * @return
     */
    private Integer getCount(TAlarmLevel tAlarmLevel){
        Integer total = (int)tAlarmLevelMapper.countByExample(getTAlarmLevelCriteria(tAlarmLevel));
        return total;
    }


    public List<TAlarmLevel> FindTAlarmLevel(TAlarmLevel tAlarmLevel){
        List<TAlarmLevel> t = tAlarmLevelMapper.selectByExample(getTAlarmLevelCriteria(tAlarmLevel));
        return t;
    }

    @Override
    public PageBean<TAlarmLevel> getAlarmLevelListbyPage(TAlarmLevel tAlarmLevel, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"id desc");
        List<TAlarmLevel> tAlarmLevelLists =FindTAlarmLevel(tAlarmLevel);
        Integer countNums =getCount(tAlarmLevel);
        PageBean<TAlarmLevel> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tAlarmLevelLists);
        return pageData;
    }

    @Override
    public String updateAlarmLevel(TAlarmLevel tAlarmLevel) {
        String msg="";
        if(tAlarmLevel.getId()!=null)
        {
            tAlarmLevelMapper.updateByPrimaryKeySelective(tAlarmLevel);
            msg="更新成功";
        }else
        {
            tAlarmLevelMapper.insertSelective(tAlarmLevel);
            msg="新建成功";
        }
        return msg;
    }

    @Override
    public String deleteAlarmLevel(TAlarmLevel tAlarmLevel) {
        String msg="";
        if(tAlarmLevel.getId()!=null){
            tAlarmLevelMapper.deleteByPrimaryKey(tAlarmLevel.getId());
            msg="删除成功";
        }
        return msg;
    }


}
