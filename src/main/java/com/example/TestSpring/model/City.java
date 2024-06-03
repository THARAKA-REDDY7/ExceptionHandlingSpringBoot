package com.example.TestSpring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @Column
    String city;
    @Column
    String state;
    @Column
    String population;
    @Column
    String airport;
    @Column
    String busstand;
    @Column
    String railwaystation;

}
