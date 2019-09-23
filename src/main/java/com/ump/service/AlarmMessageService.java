package com.ump.service;

import com.ump.entity.TAlarmMessage;
import com.ump.util.PageBean;

public interface AlarmMessageService {
    PageBean<TAlarmMessage> getAlarmMessageListbyPage(TAlarmMessage tAlarmMessage, Integer page, Integer limit);
    String updateAlarmMessage(TAlarmMessage tAlarmMessage);
    String deleteAlarmMessage(TAlarmMessage tAlarmMessage);
}
