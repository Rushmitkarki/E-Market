package com.system.E_Market.service;

import com.system.E_Market.dto.ItemDto;
import com.system.E_Market.entity.Item;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    void addItem(ItemDto itemDto) throws IOException;

    Optional<Item> getItemById(int id);

    List<Item> getAllItems() throws IOException;

    List<Item> getThreeItems(int page,String sort,String order);

    void deleteItem(int id);

    List<Item> getSixItemsByCategoryId(int id, int page, String partialName);

    List<Item> getSixItems(int page, String partialName);

    int countAllItems(String partialName);

    int countAllItemsByCategoryId(int id, String partialName);
}
