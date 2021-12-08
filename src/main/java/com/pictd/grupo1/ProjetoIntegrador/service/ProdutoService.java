package com.pictd.grupo1.ProjetoIntegrador.service;

import com.pictd.grupo1.ProjetoIntegrador.model.Categoria;
import com.pictd.grupo1.ProjetoIntegrador.model.Produto;
import com.pictd.grupo1.ProjetoIntegrador.repository.CategoriaRepository;
import com.pictd.grupo1.ProjetoIntegrador.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscar (Integer id) {
        return produtoRepository.findById(id);
    }

//    public List<Produto> buscarPorCategoria(Integer id) {
//        return produtoRepository.findByCategory(id);
//    }

}
