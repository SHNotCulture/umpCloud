package com.ump.controller.work;

import com.ump.aspect.HttpLog;
import com.ump.entity.ActionRsp;
import com.ump.entity.ControllerRsp;
import com.ump.entity.TDealLog;
import com.ump.service.DealLogService;
import com.ump.util.ActionRspUtil;
import com.ump.util.ControllerRspUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName dealLog
 * @Author xiexuanran
 * @Date 2019/9/20 15:24
 **/
@RestController
@RequestMapping(value = "dealLog")
public class DealLogController {
    @Autowired
    private DealLogService dealLogService;

    /**
     * 查询处理日志
     * @param tDealLog
     * @return
     */
    @GetMapping(value = "/getTDealLog")
    @HttpLog(operationType = "0",modularTypeName = "查询处理日志")
    public ControllerRsp getTDealLog(TDealLog tDealLog, Integer page, Integer limit){
        return ControllerRspUtil.Success(dealLogService.getDealLogListbyPage(tDealLog,page,limit));
    }


    /**
     * 更新处理日志
     * @param tDealLog
     * @return
     */
    @PostMapping(value = "/updateTDealLog")
    @HttpLog(operationType = "1",modularTypeName = "更新处理日志")
    public ActionRsp updateTDealLog(TDealLog tDealLog){
        return ActionRspUtil.Success(dealLogService.updateDealLog(tDealLog));
    }

    /**
     * 删除处理日志
     * @param tDealLog
     * @return
     */
    @PostMapping(value = "/deleteTDealLog")
    @HttpLog(operationType = "1",modularTypeName = "删除处理日志")
    public ActionRsp deleteTDealLog(TDealLog tDealLog){
        return ActionRspUtil.Success(dealLogService.deleteDealLog(tDealLog));
    }
}
