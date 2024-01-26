package com.example.testmazenboulares.Services;


import com.example.testmazenboulares.DAO.Entities.*;
import com.example.testmazenboulares.DAO.Repositories.*;
import com.example.testmazenboulares.DAO.Services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the PisteRepository bean into the
public class ClientService implements iClientService{

    ClientRepository ClientRepository;
    @Override
    public Client addCLient(Client c){
        return ClientRepository.save(c);
    }
//
//    @Override
//    public List<Piste> addAllPistes(List<Piste> Pistes){
//        return PisteRepository.saveAll(Pistes);
//    }
//
//    @Override
//    public Piste updatePiste(Piste b){
//        return PisteRepository.save(b);
//    };
//
//    @Override
//    public List<Piste> findAllPistes(){
//        return PisteRepository.findAll();
//    };
//
//
//
//    public List<Piste> UpdateAllPistes(List<Piste> Pistes){
//        return PisteRepository.saveAll(Pistes);
//    };
//
//
//    public Piste findPisteById(long id){
//        return PisteRepository.findById(id).orElse(Piste.builder().id(0).build());
//
//    };
//
//    public void deletePiste(Piste b){
//        PisteRepository.delete(b);
//    };
//
////    Optional<Piste> findPisteByID2(long id);
////
//
//    public   void deletePisteById(long id){
//        PisteRepository.deleteById(id);
//    };
//


}
