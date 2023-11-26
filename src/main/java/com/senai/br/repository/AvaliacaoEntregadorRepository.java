package com.senai.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.br.model.AvaliacaoEntregador;

public interface AvaliacaoEntregadorRepository extends JpaRepository<AvaliacaoEntregador, Integer> {

	public List<AvaliacaoEntregador> findByIdCliente(Integer id_cliente);

}
