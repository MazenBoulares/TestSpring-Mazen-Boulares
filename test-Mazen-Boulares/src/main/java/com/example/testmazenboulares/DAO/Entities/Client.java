package com.example.testmazenboulares.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Client")
public class Client {

    @Id
    @Column(name="idClient")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idClient;

    private String identifiant;



    private LocalDate datePremiereVisite;




    @ManyToMany
    private Set<Menu> listMenu;



}