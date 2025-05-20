package com.example.ProyectoPerulandiaC.service.impl;

import com.example.ProyectoPerulandiaC.modelo.ItemCarrito;
import com.example.ProyectoPerulandiaC.repository.ItemCarritoRepository;
import com.example.ProyectoPerulandiaC.service.CarritoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl implements CarritoService {

    private final ItemCarritoRepository itemCarritoRepository;

    public CarritoServiceImpl(ItemCarritoRepository itemCarritoRepository) {
        this.itemCarritoRepository = itemCarritoRepository;
    }

    @Override
    public ItemCarrito agregarItem(Integer usuarioId, Integer perfumeId, Integer cantidad) {
        // Aquí luego irá la lógica de obtener el perfume y aplicar descuento

        ItemCarrito item = new ItemCarrito();
        item.setCarritoId(usuarioId);
        item.setPerfumeId(perfumeId);
        item.setCantidad(cantidad);

        // Por ahora valores temporales
        item.setPrecioUnitario(0.0); // Esto se actualizará con el precio real + descuento
        item.setDescuentoAplicado(0); // Luego se obtiene desde el microservicio de inventario

        return itemCarritoRepository.save(item);
    }

    @Override
    public List<ItemCarrito> obtenerItemsDelCarrito(Integer usuarioId) {
        return itemCarritoRepository.findByCarritoId(usuarioId);
    }

    @Override
    public void eliminarItem(Integer itemId) {
        itemCarritoRepository.deleteById(itemId);
    }

    @Override
    public void vaciarCarrito(Integer usuarioId) {
        List<ItemCarrito> items = itemCarritoRepository.findByCarritoId(usuarioId);
        itemCarritoRepository.deleteAll(items);
    }
}
