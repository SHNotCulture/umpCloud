package com.ump.service;

import com.ump.entity.TDealLog;
import com.ump.util.PageBean;

public interface DealLogService {
    PageBean<TDealLog> getDealLogListbyPage(TDealLog tDealLog, Integer page, Integer limit);
    String updateDealLog(TDealLog tDealLog);
    String deleteDealLog(TDealLog tDealLog);
}
