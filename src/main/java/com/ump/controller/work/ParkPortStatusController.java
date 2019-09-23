package com.ump.controller.work;

import com.ump.aspect.HttpLog;
import com.ump.entity.ActionRsp;
import com.ump.entity.ControllerRsp;
import com.ump.entity.TParkPortStatus;
import com.ump.service.ParkPortStatusService;
import com.ump.util.ActionRspUtil;
import com.ump.util.ControllerRspUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName parkPortStatus
 * @Author xiexuanran
 * @Date 2019/9/20 15:24
 **/
@RestController
@RequestMapping(value = "parkPortStatus")
public class ParkPortStatusController {
    private static final Logger logger = LoggerFactory.getLogger(ParkPortStatusController.class);

    @Autowired
    private ParkPortStatusService parkPortStatusService;

    /**
     * 查询车场通道实时信息
     * @param tParkPortStatus
     * @return
     */
    @GetMapping(value = "/getParkPortStatus")
    @HttpLog(operationType = "0",modularTypeName = "查询车场通道实时信息")
    public ControllerRsp getParkPortStatus(TParkPortStatus tParkPortStatus,  Integer page, Integer limit){
        return ControllerRspUtil.Success(parkPortStatusService.getParkPortStatusListbyPage(tParkPortStatus,page,limit));
    }


    /**
     * 更新车场通道实时信息
     * @param tParkPortStatus
     * @return
     */
    @PostMapping(value = "/updateParkPortStatus")
    @HttpLog(operationType = "1",modularTypeName = "更新车场通道实时信息")
    public ActionRsp updateParkPortStatus(TParkPortStatus tParkPortStatus){
        return ActionRspUtil.Success(parkPortStatusService.updateParkPortStatus(tParkPortStatus));
    }

    /**
     * 删除车场通道实时信息
     * @param tParkPortStatus
     * @return
     */
    @PostMapping(value = "/deleteParkPortStatus")
    @HttpLog(operationType = "1",modularTypeName = "删除车场通道实时信息")
    public ActionRsp deleteParkPortStatus(TParkPortStatus tParkPortStatus){
        return ActionRspUtil.Success(parkPortStatusService.deleteParkPortStatus(tParkPortStatus));
    }
}
