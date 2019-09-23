package com.ump.thread;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author lishuhan
 * @Description:
 * @Date Create in 21:402018-11-3
 * @Modified By:
 */
@Async
@Component
public class reportScheduled {
    private static final Logger logger = LoggerFactory.getLogger(reportScheduled.class);
/*    @Autowired
    private ParkReportService parkReportService;

    *//**
     * 每日清晨一点触发
     *//*
    @Scheduled(cron = "0 0 2 * *  ?")
    public void scheduled(){
        long startTime;
        long E_time;
        logger.info("开始每日电子对账统计");
        startTime = System.currentTimeMillis();
        parkReportService.paymentForDay();
        E_time = System.currentTimeMillis() - startTime;
        logger.info("执行 电子对账统计 耗时为：" + E_time + "ms");
    }*/
}
