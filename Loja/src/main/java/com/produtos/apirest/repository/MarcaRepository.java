package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
	Marca findByNome(String nome);
}
