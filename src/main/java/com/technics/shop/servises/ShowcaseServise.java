package com.technics.shop.servises;

import com.technics.shop.entity.Item;
import com.technics.shop.entity.Showcase;

import java.util.Date;
import java.util.List;

public interface ShowcaseServise {

    List<Showcase> getAllShowcases(String type, String address, Date createdFrom, Date createdTo, Date updatedFrom, Date updatedTo);
    List<Item> getAllItemsInShowcase(Long vitrineId, String productType, Double minPrice, Double maxPrice);
    Showcase addShowcase(Showcase showcase);
    Item addProductToShowcase(Long showcaseId, Item item);
    Showcase updateVitrine(Long showcaseId, Showcase showcase);
    Item updateItem(Long showcaseId, Long itemId, Item item);
    void deleteShowcase(Long showcaseId);
    void deleteItem(Long showcaseId, Long itemId);
    List<Item> getAllProductsInShowcase(Long vitrineId, String productType, Double minPrice, Double maxPrice);
    Item updateProduct(Long vitrineId, Long productId, Item product);
}
