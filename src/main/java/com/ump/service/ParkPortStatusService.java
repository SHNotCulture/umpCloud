package com.ump.service;

import com.ump.entity.TParkPortStatus;
import com.ump.util.PageBean;

import java.util.List;

public interface ParkPortStatusService {
    List<TParkPortStatus> FindTParkPortStatus(TParkPortStatus tParkPortStatus);
    PageBean<TParkPortStatus> getParkPortStatusListbyPage(TParkPortStatus tParkPortStatus, Integer page, Integer limit);
    String updateParkPortStatus(TParkPortStatus tParkPortStatus);
    String deleteParkPortStatus(TParkPortStatus tParkPortStatus);
}
