package com.technics.shop.controllers;

import com.technics.shop.constatnts.Path;
import com.technics.shop.entity.Item;
import com.technics.shop.entity.Showcase;
import com.technics.shop.servises.ShowcaseServiseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(Path.API_SHOWCASE)
@RequiredArgsConstructor
public class ShowcaseController {

    @Autowired
    private ShowcaseServiseImpl showcaseService;

    @GetMapping
    public ResponseEntity<List<Showcase>> getAllVitrines(@RequestParam(required = false) String type,
                                                         @RequestParam(required = false) String address,
                                                         @RequestParam(required = false) Date createdFrom,
                                                         @RequestParam(required = false) Date createdTo,
                                                         @RequestParam(required = false) Date updatedFrom,
                                                         @RequestParam(required = false) Date updatedTo) {
        List<Showcase> vitrines = showcaseService.getAllShowcases(type, address, createdFrom, createdTo, updatedFrom, updatedTo);
        return new ResponseEntity<>(vitrines, HttpStatus.OK);
    }

    @GetMapping("/{vitrineId}/products")
    public ResponseEntity<List<Item>> getAllItemsInShowcase(@PathVariable Long showcaseId,
                                                                 @RequestParam(required = false) String itemType,
                                                                 @RequestParam(required = false) Double minPrice,
                                                                 @RequestParam(required = false) Double maxPrice) {
        List<Item> products = showcaseService.getAllProductsInShowcase(showcaseId, itemType, minPrice, maxPrice);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Showcase> addShowcase(@RequestBody Showcase showcase) {
        Showcase createdVitrine = showcaseService.addShowcase(showcase);
        return new ResponseEntity<>(createdVitrine, HttpStatus.CREATED);
    }

    @PostMapping("/{vitrineId}/products")
    public ResponseEntity<Item> addItemToShowcase(@PathVariable Long showcaseId, @RequestBody Item item) {
        Item createdProduct = showcaseService.addProductToShowcase(showcaseId, item);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{vitrineId}")
    public ResponseEntity<Showcase> updateShowcase(@PathVariable Long showcaseId, @RequestBody Showcase showcase) {
        Showcase updatedVitrine = showcaseService.updateShowcase(showcaseId, showcase);
        return new ResponseEntity<>(updatedVitrine, HttpStatus.OK);
    }

    @PutMapping("/{vitrineId}/products/{productId}")
    public ResponseEntity<Item> updateItem(@PathVariable Long showcaseId, @PathVariable Long itemId,
                                              @RequestBody Item item) {
        Item updatedProduct = showcaseService.updateProduct(showcaseId, itemId, item);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{vitrineId}")
    public ResponseEntity<Void> deleteShowcase(@PathVariable Long showcaseId) {
        showcaseService.deleteShowcase(showcaseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{vitrineId}/products/{productId}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long showcaseId, @PathVariable Long itemId) {
        showcaseService.deleteItem(showcaseId, itemId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
