package com.technics.shop.servises;

import com.technics.shop.entity.Items;
import com.technics.shop.entity.Showcase;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShowcaseServise {

    public List<Showcase> getAllShowcases() {
        // реализация получения всех витрин
    }

    public List<Showcase> getAllShowcasesByType(String type) {
        // реализация получения всех витрин по типу
    }

    public List<Showcase> getAllShowcasesByAddress(String address) {
        // реализация получения всех витрин по адресу
    }

    public List<Showcase> getAllShowcasesByCreationDate(Date startDate, Date endDate) {
        // реализация получения всех витрин за период по дате создания
    }

    public List<Showcase> getAllShowcasesByLastUpdateDate(Date startDate, Date endDate) {
        // реализация получения всех витрин за период по дате последней актуализации
    }

    public List<Items> getAllItemsInShowcase(long showcaseId) {
        // реализация получения всех товаров витрины
    }

    public List<Items> getAllItemsInShowcaseByType(long showcaseId, String itemType) {
        // реализация получения всех товаров витрины по типу товара
    }

    public List<Items> getAllItemsInShowcaseInPriceRange(long showcaseId, double priceMin, double priceMax) {
        // реализация получения всех товаров витрины по диапазону цен
    }

    public void addShowcase(Showcase showcase) {
        // реализация добавления витрины
    }

    public void addItemToShowcase(long showcaseId, Items item) {
        // реализация добавления товара на витрину
    }

    public void updateShowcase(long showcaseId, Showcase showcase) {
        // реализация изменения данных витрины
    }

    public void updateItem(long showcaseId, long itemId, Items item) {
        // реализация изменения данных товара
    }

    public void deleteShowcase(long showcaseId) {
        // реализация удаления витрины
    }

    public void deleteItem(long showcaseId, long itemId) {
        // реализация удаления товара
    }

}
