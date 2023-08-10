package com.system.E_Market.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartDto {
    private int id;
    private int cartQty;
    private int itemId;
    private int userId;
    private double totalPrice;
}
