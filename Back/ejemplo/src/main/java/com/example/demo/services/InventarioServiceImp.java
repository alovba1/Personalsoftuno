package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.daos.InventarioRepositorio;
import com.example.demo.models.entities.Inventario;

@Service
public class InventarioServiceImp implements InventarioService {
	@Autowired
	private InventarioRepositorio repositorio;

	@Override
	public List<Inventario> listar() {
		return (List<Inventario>) repositorio.findAll();
	}

	@Override
	public Inventario listarId(int id) {
		return repositorio.findById(id).orElse(null);
	}

	
	@Override
	public Inventario add(Inventario p) {
		return repositorio.save(p);
	}

	@Override
	public Inventario edit(Inventario p) {
		return repositorio.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	
	}

	

}
