package com.senai.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.br.model.AvaliacaoRestaurante;

public interface AvaliacaoRestauranteRepository extends JpaRepository<AvaliacaoRestaurante, Integer> {

	public List<AvaliacaoRestaurante> findById_cliente(Integer id_cliente);

}
