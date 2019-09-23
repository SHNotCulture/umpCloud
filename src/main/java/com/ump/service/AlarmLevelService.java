package com.ump.service;

import com.ump.entity.TAlarmLevel;
import com.ump.util.PageBean;

public interface AlarmLevelService {
    PageBean<TAlarmLevel> getAlarmLevelListbyPage(TAlarmLevel tAlarmLevel, Integer page, Integer limit);
    String updateAlarmLevel(TAlarmLevel tAlarmLevel);
    String deleteAlarmLevel(TAlarmLevel tAlarmLevel);
}
