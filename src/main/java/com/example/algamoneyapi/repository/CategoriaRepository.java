package com.example.algamoneyapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID>{

}
