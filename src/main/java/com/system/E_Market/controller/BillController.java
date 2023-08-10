package com.system.E_Market.controller;

import com.system.E_Market.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bill")
public class BillController {
    private final BillService billService;

    @PostMapping("/generate")
    public String generateBill() {
        billService.generateBill();
        return "redirect:/dashboard/";
    }
}
