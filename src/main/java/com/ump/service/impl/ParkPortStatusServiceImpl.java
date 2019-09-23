package com.ump.service.impl;

import com.ump.dao.TParkPortStatusMapper;
import com.ump.entity.TParkPortStatus;
import com.ump.entity.TParkPortStatusCriteria;
import com.ump.service.ParkPortStatusService;
import com.ump.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkPortStatusServiceImpl implements ParkPortStatusService {
    @Autowired
    private TParkPortStatusMapper tParkPortStatusMapper;

    //设置查询条件
    public TParkPortStatusCriteria getTParkPortStatusCriteria (TParkPortStatus tParkPortStatus){
        TParkPortStatusCriteria tParkPortStatusCriteria = new TParkPortStatusCriteria();
        TParkPortStatusCriteria.Criteria criteria = tParkPortStatusCriteria.createCriteria();
        if (tParkPortStatus!=null){

            if (tParkPortStatus.getParkId()!=null){
                criteria.andParkIdEqualTo(tParkPortStatus.getParkId());
            }
            if (tParkPortStatus.getParkName()!=null && tParkPortStatus.getParkName()!=""){
                criteria.andParkNameLike("%" + tParkPortStatus.getParkName() + "%");
            }
            if (tParkPortStatus.getPortId()!=null){
                criteria.andPortIdEqualTo(tParkPortStatus.getPortId());
            }
            if (tParkPortStatus.getPortName()!=null && tParkPortStatus.getPortName()!=""){
                criteria.andPortNameLike("%" + tParkPortStatus.getPortName() + "%");
            }
            if (tParkPortStatus.getComputerName()!=null && tParkPortStatus.getComputerName()!=""){
                criteria.andComputerNameLike("%" + tParkPortStatus.getComputerName() + "%");
            }
            if (tParkPortStatus.getIdAddress()!=null && tParkPortStatus.getIdAddress()!=""){
                criteria.andIdAddressLike("%" + tParkPortStatus.getIdAddress() + "%");
            }
            if (tParkPortStatus.getOnlineStatus()!=null){
                criteria.andOnlineStatusEqualTo(tParkPortStatus.getOnlineStatus());
            }
            if (tParkPortStatus.getCarinFlow()!=null && tParkPortStatus.getCarinFlow()!=""){
                criteria.andCarinFlowLike("%" + tParkPortStatus.getCarinFlow() + "%");
            }
            if (tParkPortStatus.getGroudSensorCamera()!=null){
                criteria.andGroudSensorCameraEqualTo(tParkPortStatus.getGroudSensorCamera());
            }
            if (tParkPortStatus.getGroudSensorBanister()!=null){
                criteria.andGroudSensorBanisterEqualTo(tParkPortStatus.getGroudSensorBanister());
            }
            if (tParkPortStatus.getCameraStaus()!=null){
                criteria.andCameraStausEqualTo(tParkPortStatus.getCameraStaus());
            }
            if (tParkPortStatus.getBanisterStatus()!=null){
                criteria.andBanisterStatusEqualTo(tParkPortStatus.getBanisterStatus());
            }
            if (tParkPortStatus.getAlarmStatus()!=null){
                criteria.andAlarmStatusEqualTo(tParkPortStatus.getAlarmStatus());
            }
            if (tParkPortStatus.getCameraCarplate()!=null && tParkPortStatus.getCameraCarplate()!=""){
                criteria.andCameraCarplateLike("%" + tParkPortStatus.getCameraCarplate() + "%");
            }
            if (tParkPortStatus.getCameraUrl()!=null && tParkPortStatus.getCameraUrl()!=""){
                criteria.andCameraUrlLike("%" + tParkPortStatus.getCameraUrl() + "%");
            }
        }
        return tParkPortStatusCriteria;
    }

    /**
     * 获取数据总量
     * @param tParkPortStatus
     * @param
     * @return
     */
    private Integer getCount(TParkPortStatus tParkPortStatus){
        Integer total = (int)tParkPortStatusMapper.countByExample(getTParkPortStatusCriteria(tParkPortStatus));
        return total;
    }


    public List<TParkPortStatus> FindTParkPortStatus(TParkPortStatus tParkPortStatus){
        List<TParkPortStatus> t = tParkPortStatusMapper.selectByExample(getTParkPortStatusCriteria(tParkPortStatus));
        return t;
    }


    @Override
    public PageBean<TParkPortStatus> getParkPortStatusListbyPage(TParkPortStatus tParkPortStatus, Integer page, Integer limit) {
        PageHelper.startPage(page, limit,"id desc");
        List<TParkPortStatus> tParkPortStatusLists =FindTParkPortStatus(tParkPortStatus);
        Integer countNums =getCount(tParkPortStatus);
        PageBean<TParkPortStatus> pageData = new PageBean<>(page, limit, countNums);
        pageData.setItems(tParkPortStatusLists);
        return pageData;
    }


    @Override
    public String updateParkPortStatus(TParkPortStatus tParkPortStatus) {
        String msg="";
        if(tParkPortStatus.getId()!=null)
        {
            tParkPortStatusMapper.updateByPrimaryKeySelective(tParkPortStatus);
            msg="更新成功";
        }else{
            tParkPortStatusMapper.insertSelective(tParkPortStatus);
            msg="新建成功";
        }
        return msg;
    }

    @Override
    public String deleteParkPortStatus(TParkPortStatus tParkPortStatus) {
        String msg="";
        if(tParkPortStatus.getId()!=null){
            tParkPortStatusMapper.deleteByPrimaryKey(tParkPortStatus.getId());
            msg="删除成功";
        }
        return msg;
    }

}
