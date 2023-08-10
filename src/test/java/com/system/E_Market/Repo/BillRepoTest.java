package com.system.E_Market.Repo;

import com.system.E_Market.entity.Bill;
import com.system.E_Market.repo.BillRepo;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public
class BillRepoTest {

    @Autowired
    private BillRepo billRepo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveBillTest() {


        Bill bill = Bill.builder()
                .date(LocalDateTime.now())
                .total(1000)
                .build();

        Bill savedBill = billRepo.save(bill);

        assertNotNull(savedBill);
    }


    @Test
    @Order(3)
    void findAllBillTest() {
        assertNotNull(billRepo.findAll());
    }




}