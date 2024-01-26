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
@Table(name="Restaurant")
public class Restaurant {

    @Id
    @Column(name="idRestaurant")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idRestaurant;

    private String nom;

    private Long nbPlacesMax;



    private LocalDate datePremiereVisite;


//
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)

    private Set<Menu> listMenus;




}