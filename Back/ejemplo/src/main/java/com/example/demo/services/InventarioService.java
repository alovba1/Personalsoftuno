package com.example.demo.services;

import java.util.List;

import com.example.demo.models.entities.Inventario;

public interface InventarioService {
public List <Inventario>listar();
public Inventario listarId(int id);
public Inventario add(Inventario p);
public Inventario edit(Inventario p);
void delete(int id);
}
