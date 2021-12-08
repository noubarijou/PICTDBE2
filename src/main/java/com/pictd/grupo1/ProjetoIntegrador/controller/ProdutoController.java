package com.pictd.grupo1.ProjetoIntegrador.controller;


import com.pictd.grupo1.ProjetoIntegrador.model.Produto;
import com.pictd.grupo1.ProjetoIntegrador.service.CategoriaService;
import com.pictd.grupo1.ProjetoIntegrador.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }

//    public ResponseEntity<List<Produto>> buscarTodos(){
//        return ResponseEntity.ok(produtoService.buscarTodos());
//    }

    @GetMapping ("/{id}")
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable Integer id){
        return ResponseEntity.ok(produtoService.buscar(id));
    }

//    @GetMapping ("/categoria/{id}")
//    public ResponseEntity<List<Produto>> buscarPorCategoria(@PathVariable Integer id) {
//        Produto produto = produtoService.buscarPorCategoria(id);
//        return ResponseEntity.ok(produto);
//    }

}
