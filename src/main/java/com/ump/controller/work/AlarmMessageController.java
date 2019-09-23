package com.ump.controller.work;

import com.ump.aspect.HttpLog;
import com.ump.entity.ActionRsp;
import com.ump.entity.ControllerRsp;
import com.ump.entity.TAlarmMessage;
import com.ump.service.AlarmMessageService;
import com.ump.util.ActionRspUtil;
import com.ump.util.ControllerRspUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName alarmMessage
 * @Author xiexuanran
 * @Date 2019/9/20 15:24
 **/
@RestController
@RequestMapping(value = "alarmMessage")
public class AlarmMessageController {
    @Autowired
    private AlarmMessageService alarmMessageService;

    /**
     * 查询报警工单信息
     * @param tAlarmMessage
     * @return
     */
    @GetMapping(value = "/getAlarmMessage")
    @HttpLog(operationType = "0",modularTypeName = "查询报警工单信息")
    public ControllerRsp getAlarmMessage(TAlarmMessage tAlarmMessage, Integer page, Integer limit){
        return ControllerRspUtil.Success(alarmMessageService.getAlarmMessageListbyPage(tAlarmMessage,page,limit));
    }


    /**
     * 更新报警工单信息
     * @param tAlarmMessage
     * @return
     */
    @PostMapping(value = "/updateAlarmMessage")
    @HttpLog(operationType = "1",modularTypeName = "更新报警工单信息")
    public ActionRsp updateAlarmMessage(TAlarmMessage tAlarmMessage){
        return ActionRspUtil.Success(alarmMessageService.updateAlarmMessage(tAlarmMessage));
    }

    /**
     * 删除报警工单信息
     * @param tAlarmMessage
     * @return
     */
    @PostMapping(value = "/deleteAlarmMessage")
    @HttpLog(operationType = "1",modularTypeName = "删除报警工单信息")
    public ActionRsp deleteAlarmMessage(TAlarmMessage tAlarmMessage){
        return ActionRspUtil.Success(alarmMessageService.deleteAlarmMessage(tAlarmMessage));
    }
}
