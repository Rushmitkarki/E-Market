package com.system.E_Market.service;

import com.system.E_Market.entity.UserHistory;

import java.util.List;

public interface UserHistoryService {


    void generateAllUserHistory();

    List<UserHistory> getAllUserHistoryByUser(int id);


}
