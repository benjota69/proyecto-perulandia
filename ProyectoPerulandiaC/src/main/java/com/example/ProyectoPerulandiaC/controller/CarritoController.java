package com.example.ProyectoPerulandiaC.controller;

import com.example.ProyectoPerulandiaC.modelo.ItemCarrito;
import com.example.ProyectoPerulandiaC.service.CarritoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/carritos")
public class CarritoController {

    private final CarritoService carritoService;

    public CarritoController(CarritoService carritoService) {
        this.carritoService = carritoService;
    }

    @PostMapping("/{usuarioId}/items")
    public ItemCarrito agregarItem(@PathVariable Integer usuarioId, @RequestParam Integer perfumeId, @RequestParam Integer cantidad) {
        
        return carritoService.agregarItem(usuarioId, perfumeId, cantidad);
    }

    @GetMapping("/{usuarioId}")
    public List<ItemCarrito> obtenerCarrito(@PathVariable Integer usuarioId) {
        return carritoService.obtenerItemsDelCarrito(usuarioId);
    }

    @DeleteMapping("/items/{itemId}")
    public void eliminarItem(@PathVariable Integer itemId) {
        carritoService.eliminarItem(itemId);
    }

    @DeleteMapping("/{usuarioId}")
    public void vaciarCarrito(@PathVariable Integer usuarioId) {
        carritoService.vaciarCarrito(usuarioId);
    }
}
