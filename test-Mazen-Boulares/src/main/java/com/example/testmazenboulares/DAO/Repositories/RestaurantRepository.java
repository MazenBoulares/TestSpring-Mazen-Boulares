package com.example.testmazenboulares.DAO.Repositories;

import com.example.testmazenboulares.DAO.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {





}
