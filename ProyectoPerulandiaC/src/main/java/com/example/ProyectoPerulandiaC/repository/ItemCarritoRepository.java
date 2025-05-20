package com.example.ProyectoPerulandiaC.repository;

import com.example.ProyectoPerulandiaC.modelo.ItemCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemCarritoRepository extends JpaRepository<ItemCarrito, Integer> {
    
    List<ItemCarrito> findByCarritoId(Integer carritoId);
}
