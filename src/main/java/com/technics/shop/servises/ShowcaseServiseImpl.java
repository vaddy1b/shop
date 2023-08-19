package com.technics.shop.servises;

import com.technics.shop.entity.Item;
import com.technics.shop.entity.Showcase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowcaseServiseImpl implements ShowcaseServise{



    @Override
    public List<Showcase> getAllShowcases(String type, String address, Date createdFrom, Date createdTo, Date updatedFrom, Date updatedTo) {

        return null;
    }

    @Override
    public List<Item> getAllItemsInShowcase(Long showcaseId, String itemType, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public Showcase addShowcase(Showcase showcase) {
        return null;
    }

    @Override
    public Item addProductToShowcase(Long showcaseId, Item item) {
        return null;
    }

    @Override
    public Showcase updateShowcase(Long showcaseId, Showcase showcase) {
        return null;
    }

    @Override
    public Item updateItem(Long showcaseId, Long itemId, Item item) {
        return null;
    }

    @Override
    public void deleteShowcase(Long showcaseId) {

    }

    @Override
    public void deleteItem(Long showcaseId, Long itemId) {

    }

    @Override
    public List<Item> getAllProductsInShowcase(Long showcaseId, String itemType, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public List<Item> getAllItemInShowcase(Long showcaseId, String itemType, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public Item updateProduct(Long showcaseId, Long itemId, Item item) {
        return null;
    }
}
