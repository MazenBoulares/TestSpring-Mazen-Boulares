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



//    @GetMapping
//    public List<String> libelleMenuparTypeMenuOrdonneparprixTotal(TypeMenu typeMenu){
//
//
//        return iRestaurantService.findAllRestaurants(typeMenu);
//    }






//    //@requestbody => on va passer un objet dans les parametres (json)
//    // int,float, string => @ReqyestParam ou @PathVariable
//

//    @GetMapping("/{id}")
//    public Piste getById(@PathVariable long id) {
//
//        return iPisteService.findPisteById(id);
//    }


//
//    @PutMapping()
//    public Piste updatePiste(@RequestBody Piste Piste){
//        return iPisteService.updatePiste(Piste);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> updatePiste(@PathVariable long id){
//        try { iPisteService.deletePisteById(id);
//            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
//        } catch (EmptyResultDataAccessException e) {
//            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//

}
