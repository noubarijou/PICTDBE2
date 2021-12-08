package com.pictd.grupo1.ProjetoIntegrador.service;

import com.pictd.grupo1.ProjetoIntegrador.model.Categoria;
import com.pictd.grupo1.ProjetoIntegrador.model.Produto;
import com.pictd.grupo1.ProjetoIntegrador.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscar (Integer id) {
        return categoriaRepository.findById(id);
    }

}
