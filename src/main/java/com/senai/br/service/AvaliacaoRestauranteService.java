package com.senai.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.br.dto.AvaliacaoRestauranteDto;
import com.senai.br.model.AvaliacaoRestaurante;
import com.senai.br.repository.AvaliacaoRestauranteRepository;

@Service
public class AvaliacaoRestauranteService {

	@Autowired
	private AvaliacaoRestauranteRepository avaliacaoRestauranteRepository;

	public AvaliacaoRestaurante salvarAvaliacaoRestaurante(AvaliacaoRestauranteDto avaliacaoRestauranteDto) {

		AvaliacaoRestaurante avaliacaoRestaurante = new AvaliacaoRestaurante(avaliacaoRestauranteDto);

		return avaliacaoRestauranteRepository.save(avaliacaoRestaurante);

	}

	public List<AvaliacaoRestaurante> listarPorCliente(Integer id) {

		return avaliacaoRestauranteRepository.findByIdCliente(id);

	}

	
	public void excluirAvaliacaoRestaurante(Integer id) {

		avaliacaoRestauranteRepository.deleteById(id);

	}

}
