package com.system.E_Market.service;

import com.system.E_Market.dto.CartDto;
import com.system.E_Market.entity.Cart;
import com.system.E_Market.entity.User;

import java.util.List;

public interface CartService {

    void addToCart(CartDto cartDto);

    List<Cart> getCartList(User user);

    List<Cart> getCartListByStatus(User user);

    List<Cart> getCartListByStatusUnpaid(User user);

    void deleteCart(int id);

    void editCart(CartDto cartDto);
}
