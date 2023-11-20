package com.senai.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.br.dto.AvaliacaoEntregadorDto;
import com.senai.br.model.AvaliacaoEntregador;
import com.senai.br.repository.AvaliacaoEntregadorRepository;

@Service
public class AvaliacaoEntregadorService {

	@Autowired
	private AvaliacaoEntregadorRepository avaliacaoEntregadorRepository;
	
	public AvaliacaoEntregador salvarAvaliacaoEntregador (AvaliacaoEntregadorDto avaliacaoEntregadorDto) {
		
		AvaliacaoEntregador avaliacaoEntregador = new AvaliacaoEntregador(avaliacaoEntregadorDto);
		
		return avaliacaoEntregadorRepository.save(avaliacaoEntregador);
	}
	
		public List<AvaliacaoEntregador> listarPorCliente(Integer id) {
			
			return avaliacaoEntregadorRepository.findById_cliente(id);
			
		}
		
		public void excluirAvaliacaoEntregador(Integer id) {
			
			avaliacaoEntregadorRepository.deleteById(id);
			
		}
		
	}

