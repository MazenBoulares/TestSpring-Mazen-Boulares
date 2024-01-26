package com.example.testmazenboulares.DAO.Repositories;

import com.example.testmazenboulares.DAO.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


}
