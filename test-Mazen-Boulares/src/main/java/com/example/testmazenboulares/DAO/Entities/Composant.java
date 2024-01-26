package com.example.testmazenboulares.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Composant")
public class Composant {

    @Id
    @Column(name="idComposant")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idComposant;

    private String nomComposant;

    private float prix;




    @ManyToOne
    private Menu menu;








}