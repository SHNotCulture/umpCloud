package com.ump.service.impl;

import com.ump.dao.TDealLogMapper;
import com.ump.entity.TDealLog;
import com.ump.entity.TDealLogCriteria;
import com.ump.service.DealLogService;
import com.ump.util.DateUtil;
import com.ump.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealLogServiceImpl implements DealLogService {
    @Autowired
    private TDealLogMapper tDealLogMapper;

    //设置查询条件
    public TDealLogCriteria getTDealLogCriteria (TDealLog tDealLog){
        TDealLogCriteria tDealLogCriteria = new TDealLogCriteria();
        TDealLogCriteria.Criteria criteria = tDealLogCriteria.createCriteria();
        if (tDealLog!=null){

            if (tDealLog.getDealType()!=null){
                criteria.andDealTypeEqualTo(tDealLog.getDealType());
            }
            if (tDealLog.getDealContent()!=null && tDealLog.getDealContent()!=""){
                criteria.andDealContentLike("%" + tDealLog.getDealContent() + "%");
            }
            if (tDealLog.getUserId()!=null){
                criteria.andUserIdEqualTo(tDealLog.getUserId());
            }
            if (tDealLog.getUserName()!=null && tDealLog.getUserName()!=""){
                criteria.andUserNameLike("%" + tDealLog.getUserName() + "%");
            }
            if (tDealLog.getCreateTime()!=null && tDealLog.getCreateTime()!=""){
                criteria.andCreateTimeLike("%" + tDealLog.getCreateTime() + "%");
            }
        }
        return tDealLogCriteria;
    }

    /**
     * 获取数据总量
     * @param tDealLog
     * @param
     * @return
     */
    private Integer getCount(TDealLog tDealLog){
        Integer total = (int)tDealLogMapper.countByExample(getTDealLogCriteria(tDealLog));
        return total;
    }

    public List<TDealLog> FindTDealLog(TDealLog tDealLog){
        List<TDealLog> t = tDealLogMapper.selectByExample(getTDealLogCriteria(tDealLog));
        return t;
    }

    @Override
    public PageBean<TDealLog> getDealLogListbyPage(TDealLog tDealLog, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"id desc");
        List<TDealLog> tDealLogLists =FindTDealLog(tDealLog);
        Integer countNums =getCount(tDealLog);
        PageBean<TDealLog> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tDealLogLists);
        return pageData;
    }

    @Override
    public String updateDealLog(TDealLog tDealLog) {
        String msg="";
        if(tDealLog.getId()!=null)
        {
            tDealLog.setCreateTime(DateUtil.getCurDateTime());
            tDealLogMapper.updateByPrimaryKeySelective(tDealLog);
            msg="更新成功";
        }else{
            tDealLogMapper.insertSelective(tDealLog);
            msg="新建成功";
        }
        return msg;
    }

    @Override
    public String deleteDealLog(TDealLog tDealLog) {
        String msg="";
        if(tDealLog.getId()!=null){
            tDealLogMapper.deleteByPrimaryKey(tDealLog.getId());
            msg="删除成功";
        }
        return msg;
    }

}
