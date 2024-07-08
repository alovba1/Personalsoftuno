package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.Inventario;
import com.example.demo.services.InventarioService;
//@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@CrossOrigin(origins="*", maxAge = 3600)
@RestController
@RequestMapping({"/inventario"})
public class Controlador {

	@Autowired 
	InventarioService servicio;
	@GetMapping
	public List<Inventario> listar() {
	   return servicio.listar();
	}
	@PostMapping
	public Inventario add(@RequestBody Inventario p ){
		   return servicio.add(p);
    }
	@GetMapping(path ={"/{id}"})
	public Inventario listarId(@PathVariable("id")int id) {
	   return servicio.listarId(id);
	}
	
	

	//@PutMapping()
	@PutMapping("/{id}")
	public Inventario edit(@RequestBody Inventario p, @PathVariable("id")int id){
	  p.setId(id);
		return servicio.edit(p);
	}
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable("id")int id){
			servicio.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT.value()).build();
		}
}