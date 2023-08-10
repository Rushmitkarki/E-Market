package com.system.E_Market.service;

import com.system.E_Market.entity.Bill;

import java.util.List;

public interface BillService {

    void generateBill();

    List<Bill> getAllBillsByUser(int id);

    List<Bill> getBillForTenDays();
}
