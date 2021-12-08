package com.pictd.grupo1.ProjetoIntegrador.controller;

import com.pictd.grupo1.ProjetoIntegrador.model.Categoria;
import com.pictd.grupo1.ProjetoIntegrador.model.Produto;
import com.pictd.grupo1.ProjetoIntegrador.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarTodos(){
        return ResponseEntity.ok(categoriaService.buscarTodos());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Optional<Categoria>> buscar(@PathVariable Integer id){
        return ResponseEntity.ok(categoriaService.buscar(id));
    }
}
