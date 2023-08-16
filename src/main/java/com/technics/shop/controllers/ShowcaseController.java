package com.technics.shop.controllers;

import com.technics.shop.constatnts.Path;
import com.technics.shop.entity.Showcase;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Path.API_SHOWCASE)
public class ShowcaseController {

    private

    @GetMapping("/{id}")
    public Showcase getShowcase(@PathVariable UUID id) {
        // Извлечь из хранилища и вернуть данные витрины по идентификатору
    }

    @PostMapping
    public Showcase createShowcase(@RequestBody Showcase showcase) {
        // Сохранить данные витрины в хранилище и вернуть созданный объект
    }

    @PutMapping("/{id}")
    public Showcase updateShowcase(@PathVariable UUID id, @RequestBody Showcase showcase) {
        // Обновить данные витрины в хранилище по идентификатору и вернуть обновленный объект
    }

    @DeleteMapping("/{id}")
    public void deleteShowcase(@PathVariable UUID id) {
        // Удалить данные витрины из хранилища по идентификатору
    }
}
