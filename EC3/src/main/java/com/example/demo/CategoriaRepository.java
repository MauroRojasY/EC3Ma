package main.java.com.example.demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "cursos")
public class CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer>, CrudRepository<Categoria, Integer> {
    /**
     * @param nombre
     * @return
     */
    List<Categoria>findByNombre(@Param("nombre") String nombre);
}
