package com.example.testmazenboulares.RestController;

import com.example.testmazenboulares.DAO.Entities.Client;
import com.example.testmazenboulares.DAO.Entities.ENUM.TypeMenu;
import com.example.testmazenboulares.DAO.Entities.Restaurant;
import com.example.testmazenboulares.DAO.Services.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
@AllArgsConstructor
public class RestController {

    iClientService iClientService;

    iRestaurantService iRestaurantService;




    @PostMapping("/addClient")
    public Client ajouterClient(@RequestBody Client client){
        return iClientService.addCLient(client);
    }




    @PostMapping("/addRestaurant")
    public Restaurant ajouterRestaurantEtMenuAssociés(@RequestBody Restaurant restaurant){
        return iRestaurantService.addRestaurant(restaurant);
    }



}
