package com.example.testmazenboulares.Services;


import com.example.testmazenboulares.DAO.Entities.Client;
import com.example.testmazenboulares.DAO.Entities.Restaurant;
import com.example.testmazenboulares.DAO.Repositories.ClientRepository;
import com.example.testmazenboulares.DAO.Repositories.RestaurantRepository;
import com.example.testmazenboulares.DAO.Services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the PisteRepository bean into the
public class RestaurantService implements iRestaurantService{

    RestaurantRepository  RestaurantRepository;
    @Override
    public Restaurant addRestaurant(Restaurant r){
        return RestaurantRepository.save(r);
    }


}
