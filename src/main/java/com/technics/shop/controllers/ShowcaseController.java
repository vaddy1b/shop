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

    private ShowcaseServiseImpl showcaseServise;

    private ShowcaseServiseImpl vitrineService;

    @GetMapping
    public ResponseEntity<List<Showcase>> getAllVitrines(@RequestParam(required = false) String type,
                                                         @RequestParam(required = false) String address,
                                                         @RequestParam(required = false) Date createdFrom,
                                                         @RequestParam(required = false) Date createdTo,
                                                         @RequestParam(required = false) Date updatedFrom,
                                                         @RequestParam(required = false) Date updatedTo) {
        List<Showcase> vitrines = vitrineService.getAllShowcases(type, address, createdFrom, createdTo, updatedFrom, updatedTo);
        return new ResponseEntity<>(vitrines, HttpStatus.OK);
    }

    @GetMapping("/{vitrineId}/products")
    public ResponseEntity<List<Item>> getAllProductsInVitrine(@PathVariable Long vitrineId,
                                                                 @RequestParam(required = false) String productType,
                                                                 @RequestParam(required = false) Double minPrice,
                                                                 @RequestParam(required = false) Double maxPrice) {
        List<Item> products = vitrineService.getAllProductsInShowcase(vitrineId, productType, minPrice, maxPrice);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Showcase> addVitrine(@RequestBody Showcase vitrine) {
        Showcase createdVitrine = vitrineService.addShowcase(vitrine);
        return new ResponseEntity<>(createdVitrine, HttpStatus.CREATED);
    }

    @PostMapping("/{vitrineId}/products")
    public ResponseEntity<Item> addProductToVitrine(@PathVariable Long vitrineId, @RequestBody Item product) {
        Item createdProduct = vitrineService.addProductToShowcase(vitrineId, product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{vitrineId}")
    public ResponseEntity<Showcase> updateVitrine(@PathVariable Long vitrineId, @RequestBody Showcase vitrine) {
        Showcase updatedVitrine = vitrineService.updateVitrine(vitrineId, vitrine);
        return new ResponseEntity<>(updatedVitrine, HttpStatus.OK);
    }

    @PutMapping("/{vitrineId}/products/{productId}")
    public ResponseEntity<Item> updateProduct(@PathVariable Long vitrineId, @PathVariable Long productId,
                                              @RequestBody Item product) {
        Item updatedProduct = vitrineService.updateProduct(vitrineId, productId, product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{vitrineId}")
    public ResponseEntity<Void> deleteVitrine(@PathVariable Long vitrineId) {
        vitrineService.deleteShowcase(vitrineId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{vitrineId}/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long vitrineId, @PathVariable Long productId) {
        vitrineService.deleteItem(vitrineId, productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
