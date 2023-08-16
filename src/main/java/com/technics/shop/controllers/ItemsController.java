package com.technics.shop.controllers;

import com.technics.shop.constatnts.Path;
import com.technics.shop.entity.Items;
import com.technics.shop.entity.Showcase;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Path.API_ITEMS)
public class ItemsController {

    @GetMapping("/{id}")
    public Items getProduct(@PathVariable UUID id) {
        // Извлечь из хранилища и вернуть данные товара по идентификатору
    }

    @PostMapping
    public Items createProduct(@RequestBody Items product) {
        // Сохранить данные товара в хранилище и вернуть созданный объект
    }

    @PutMapping("/{id}")
    public Items updateProduct(@PathVariable UUID id, @RequestBody Items product) {
        // Обновить данные товара в хранилище по идентификатору и вернуть обновленный объект
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        // Удалить данные товара из хранилища по идентификатору
    }


}
