package com.perulandia.cl.perulandia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perfume")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Perfume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private Integer ml;

    @Column(nullable=false)
    private String marca;

    @Column(nullable=false)
    private String descripcion;
    
}
