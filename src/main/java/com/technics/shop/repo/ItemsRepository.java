package com.technics.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemsRepository extends JpaRepository<ItemsRepository, UUID> {
}
