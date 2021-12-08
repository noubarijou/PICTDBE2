package com.pictd.grupo1.ProjetoIntegrador.repository;

import com.pictd.grupo1.ProjetoIntegrador.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

//    List<Produto> findByCategory (Integer id);
}
