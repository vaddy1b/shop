package com.technics.shop.servises;

import com.technics.shop.entity.Item;
import com.technics.shop.entity.Showcase;
import com.technics.shop.repo.ItemsRepository;
import com.technics.shop.repo.ShowcaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowcaseServiseImpl implements ShowcaseServise{


    private final ItemsRepository itemsRepository;

    private final ShowcaseRepository showcaseRepository;
//
//    private final CarMapper carMapper;
//    private final EngineMapper engineMapper;
//    private final OwnerMapper ownerMapper;
//    private final WheelMapper wheelMapper;

    @Override
    public List<Showcase> getAllShowcases(String type, String address, Date createdFrom, Date createdTo, Date updatedFrom, Date updatedTo) {
        return null;
    }

    @Override
    public List<Item> getAllItemsInShowcase(Long vitrineId, String productType, Double minPrice, Double maxPrice) {
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
    public Showcase updateVitrine(Long showcaseId, Showcase showcase) {
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
    public List<Item> getAllProductsInShowcase(Long vitrineId, String productType, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public Item updateProduct(Long vitrineId, Long productId, Item product) {
        return null;
    }
}
