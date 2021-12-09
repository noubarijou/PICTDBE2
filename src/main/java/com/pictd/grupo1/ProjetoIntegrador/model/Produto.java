package com.pictd.grupo1.ProjetoIntegrador.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false)
    private double preco;
    @Column(nullable = false, length = 1000)
    private String descricao;
    @Column(nullable = false)
    private String imagem;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
