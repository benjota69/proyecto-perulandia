package com.example.ProyectoPerulandiaC.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "item_carrito")
@NoArgsConstructor
@AllArgsConstructor


public class ItemCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer carritoId;  

    @Column(nullable = false)
    private Integer perfumeId;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precioUnitario;
    
    @Column(nullable = false)
    private Integer descuentoAplicado = 0;

}