package com.technics.shop.dao;

import com.technics.shop.entity.Item;
import com.technics.shop.entity.Showcase;

import java.util.List;

public interface ItemDao {

    List<Item> getAllItemsInShowcase(Long vitrineId, String productType, Double minPrice, Double maxPrice);
    Item addProductToShowcase(Long showcaseId, Item item);
    Showcase updateShowcase(Long showcaseId, Showcase showcase);
    Item updateItem(Long showcaseId, Long itemId, Item item);
    void deleteItem(Long showcaseId, Long itemId);
    Item updateProduct(Long showcaseId, Long productId, Item product);
}
