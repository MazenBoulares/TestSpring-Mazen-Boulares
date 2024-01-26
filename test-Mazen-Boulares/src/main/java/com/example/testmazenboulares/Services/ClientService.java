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


}
