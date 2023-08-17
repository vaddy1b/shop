package com.technics.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsRepository, UUID> {


}
