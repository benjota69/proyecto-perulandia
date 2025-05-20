package com.example.ProyectoPerulandiaC.service;

import com.example.ProyectoPerulandiaC.modelo.ItemCarrito;

import java.util.List;

public interface CarritoService {

    // Agrega un perfume al carrito de un usuario
    ItemCarrito agregarItem(Integer usuarioId, Integer perfumeId, Integer cantidad);

    // Devuelve todos los ítems del carrito de un usuario
    List<ItemCarrito> obtenerItemsDelCarrito(Integer usuarioId);

    // Elimina un ítem específico del carrito
    void eliminarItem(Integer itemId);

    // Vacía todo el carrito del usuario
    void vaciarCarrito(Integer usuarioId);
}
