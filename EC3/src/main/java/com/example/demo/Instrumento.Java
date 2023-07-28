package com.example.demo;

import jakarta.annotation.Generated;

@Entity
@Table(name = "instrumento")
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer idCategoria;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @ManyToOne(cascade = cascadeType.ALL)
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    
}
