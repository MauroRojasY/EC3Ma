package main.java.com.example.demo;
 

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table; 

@Entity

@Tables (name = "categoria")

public class Categoria { 

    @Id

    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String nombre;

 

    @OneToMany(targetEntity = Instrumento.class, mappedBy = "categoria")

    @OrderBy("nombre ASC")

    private Set<Instrumento> instrumentos = new HashSet<Instrumento>();

 

    public Set<Categoria> getInstrumentos(){

        return instrumentos;

    }

    public void setInstrumentos(Set<Instrumento> instrumentos){

        this.instrumentos = instrumentos;

    }

 

    public Integer getId(){

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getNombre(){

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

 

}