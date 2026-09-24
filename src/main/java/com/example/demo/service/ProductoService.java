package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;


@Service 
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

     
    public List<Producto> listarTodos(){
        return productoRepository.findAll();
    }

    public Optional<Producto> consultarPorId(Long id){
        return productoRepository.findById(id);
    }
    

}
