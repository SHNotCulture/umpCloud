package com.ump.service.impl;

import com.ump.dao.TAlarmMessageMapper;
import com.ump.entity.TAlarmMessage;
import com.ump.entity.TAlarmMessageCriteria;
import com.ump.service.AlarmMessageService;
import com.ump.util.DateUtil;
import com.ump.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmMessageServiceImpl implements AlarmMessageService {
    @Autowired
    private TAlarmMessageMapper tAlarmMessageMapper;


    //设置查询条件
    public TAlarmMessageCriteria getTAlarmMessageCriteria (TAlarmMessage tAlarmMessage){
        TAlarmMessageCriteria tAlarmMessageCriteria = new TAlarmMessageCriteria();
        TAlarmMessageCriteria.Criteria criteria = tAlarmMessageCriteria.createCriteria();
        if (tAlarmMessage!=null){

            if (tAlarmMessage.getParkId()!=null){
                criteria.andParkIdEqualTo(tAlarmMessage.getParkId());
            }
            if (tAlarmMessage.getParkName()!=null && tAlarmMessage.getParkName()!=""){
                criteria.andParkNameLike("%" + tAlarmMessage.getParkName() + "%");
            }
            if (tAlarmMessage.getPortId()!=null){
                criteria.andPortIdEqualTo(tAlarmMessage.getPortId());
            }
            if (tAlarmMessage.getPortName()!=null && tAlarmMessage.getPortName()!=""){
                criteria.andPortNameLike("%" + tAlarmMessage.getPortName() + "%");
            }
            if (tAlarmMessage.getComputerName()!=null && tAlarmMessage.getComputerName()!=""){
                criteria.andComputerNameLike("%" + tAlarmMessage.getComputerName() + "%");
            }
            if (tAlarmMessage.getOnlineStatus()!=null){
                criteria.andOnlineStatusEqualTo(tAlarmMessage.getOnlineStatus());
            }
            if (tAlarmMessage.getCarinFlow()!=null && tAlarmMessage.getCarinFlow()!=""){
                criteria.andCarinFlowLike("%" + tAlarmMessage.getCarinFlow() + "%");
            }
            if (tAlarmMessage.getGroudSensorCamera()!=null){
                criteria.andGroudSensorCameraEqualTo(tAlarmMessage.getGroudSensorCamera());
            }
            if (tAlarmMessage.getGroudSensorBanister()!=null){
                criteria.andGroudSensorBanisterEqualTo(tAlarmMessage.getGroudSensorBanister());
            }
            if (tAlarmMessage.getCameraStaus()!=null){
                criteria.andCameraStausEqualTo(tAlarmMessage.getCameraStaus());
            }
            if (tAlarmMessage.getBanisterStatus()!=null){
                criteria.andBanisterStatusEqualTo(tAlarmMessage.getBanisterStatus());
            }
            if (tAlarmMessage.getAlarmStatus()!=null){
                criteria.andAlarmStatusEqualTo(tAlarmMessage.getAlarmStatus());
            }
            if (tAlarmMessage.getAlarmLevel()!=null){
                criteria.andAlarmLevelEqualTo(tAlarmMessage.getAlarmLevel());
            }
            if (tAlarmMessage.getAlarmTime()!=null && tAlarmMessage.getAlarmTime()!=""){
                criteria.andAlarmTimeLike("%" + tAlarmMessage.getAlarmTime() + "%");
            }
            if (tAlarmMessage.getDealStatus()!=null){
                criteria.andDealStatusEqualTo(tAlarmMessage.getDealStatus());
            }
            if (tAlarmMessage.getUserId()!=null){
                criteria.andUserIdEqualTo(tAlarmMessage.getUserId());
            }
            if (tAlarmMessage.getUserName()!=null && tAlarmMessage.getUserName()!=""){
                criteria.andUserNameLike("%" + tAlarmMessage.getUserName() + "%");
            }
            if (tAlarmMessage.getCreateTime()!=null && tAlarmMessage.getCreateTime()!=""){
                criteria.andCreateTimeLike("%" + tAlarmMessage.getCreateTime() + "%");
            }
        }
        return tAlarmMessageCriteria;
    }

    /**
     * 获取数据总量
     * @param tAlarmMessage
     * @param
     * @return
     */
    private Integer getCount(TAlarmMessage tAlarmMessage){
        Integer total = (int)tAlarmMessageMapper.countByExample(getTAlarmMessageCriteria(tAlarmMessage));
        return total;
    }


    public List<TAlarmMessage> FindTAlarmMessage(TAlarmMessage tAlarmMessage){
        List<TAlarmMessage> t = tAlarmMessageMapper.selectByExample(getTAlarmMessageCriteria(tAlarmMessage));
        return t;
    }

    @Override
    public PageBean<TAlarmMessage> getAlarmMessageListbyPage(TAlarmMessage tAlarmMessage, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"id desc");
        List<TAlarmMessage> tAlarmMessageLists =FindTAlarmMessage(tAlarmMessage);
        Integer countNums =getCount(tAlarmMessage);
        PageBean<TAlarmMessage> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tAlarmMessageLists);
        return pageData;
    }

    @Override
    public String updateAlarmMessage(TAlarmMessage tAlarmMessage) {
        String msg="";
        if(tAlarmMessage.getId()!=null)
        {
            tAlarmMessage.setCreateTime(DateUtil.getCurDateTime());
            tAlarmMessageMapper.updateByPrimaryKeySelective(tAlarmMessage);
            msg="更新成功";
        }else{
            tAlarmMessageMapper.insertSelective(tAlarmMessage);
            msg="新建成功";
        }
        return msg;
    }

    @Override
    public String deleteAlarmMessage(TAlarmMessage tAlarmMessage) {
        String msg="";
        if(tAlarmMessage.getId()!=null){
            tAlarmMessageMapper.deleteByPrimaryKey(tAlarmMessage.getId());
            msg="删除成功";
        }
        return msg;
    }

}
