package com.example.testmazenboulares.DAO.Entities;


import com.example.testmazenboulares.DAO.Entities.ENUM.Couleur;
import com.example.testmazenboulares.DAO.Entities.ENUM.TypeMenu;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Menu")
public class Menu {

    @Id
    @Column(name="idMenu")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private float prixTotal;



//
    @ManyToMany
    private Set<Client> listClient;



//
//
    @OneToMany(mappedBy="menu")
    private Set<Composant> listComposants;







}