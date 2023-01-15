package com.portfolio.ariel.Repository;

import com.portfolio.ariel.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    public Optional<Proyecto> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}