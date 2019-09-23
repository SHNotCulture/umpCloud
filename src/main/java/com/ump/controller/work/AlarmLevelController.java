package com.ump.controller.work;

import com.ump.aspect.HttpLog;
import com.ump.entity.ActionRsp;
import com.ump.entity.ControllerRsp;
import com.ump.entity.TAlarmLevel;
import com.ump.service.AlarmLevelService;
import com.ump.util.ActionRspUtil;
import com.ump.util.ControllerRspUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName alarmLevel
 * @Author xiexuanran
 * @Date 2019/9/20 16:47
 **/
@RestController
@RequestMapping(value = "alarmLevel")
public class AlarmLevelController {

    @Autowired
    private AlarmLevelService alarmLevelService;

    /**
     * 查询报警等级
     * @param tAlarmLevel
     * @return
     */
    @GetMapping(value = "/getAlarmLevel")
    @HttpLog(operationType = "0",modularTypeName = "查询报警等级")
    public ControllerRsp getAlarmLevel(TAlarmLevel tAlarmLevel, Integer page, Integer limit){
        return ControllerRspUtil.Success(alarmLevelService.getAlarmLevelListbyPage(tAlarmLevel,page,limit));
    }


    /**
     * 更新报警等级
     * @param tAlarmLevel
     * @return
     */
    @PostMapping(value = "/updateAlarmLevel")
    @HttpLog(operationType = "1",modularTypeName = "更新报警等级")
    public ActionRsp updateAlarmLevel(TAlarmLevel tAlarmLevel){
        return ActionRspUtil.Success(alarmLevelService.updateAlarmLevel(tAlarmLevel));
    }

    /**
     * 删除报警等级
     * @param tAlarmLevel
     * @return
     */
    @PostMapping(value = "/deleteAlarmLevel")
    @HttpLog(operationType = "1",modularTypeName = "删除报警等级")
    public ActionRsp deleteAlarmLevel(TAlarmLevel tAlarmLevel){
        return ActionRspUtil.Success(alarmLevelService.deleteAlarmLevel(tAlarmLevel));
    }
}
