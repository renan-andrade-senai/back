package com.senai.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.br.dto.AvaliacaoEntregadorDto;
import com.senai.br.model.AvaliacaoEntregador;
import com.senai.br.service.AvaliacaoEntregadorService;

@RestController
@RequestMapping("/avaliacaoEntregador")
public class AvaliacaoEntregadorController {

	@Autowired
	private AvaliacaoEntregadorService avaliacaoEntregadorService;

	@PostMapping
	public ResponseEntity<AvaliacaoEntregadorDto> cadastraAvaliacaoEntregador(
			@RequestBody AvaliacaoEntregadorDto avaliacaoEntregadorDto) {
		AvaliacaoEntregador avaliacaoEntregador = avaliacaoEntregadorService
				.salvarAvaliacaoEntregador(avaliacaoEntregadorDto);
		return ResponseEntity.ok(new AvaliacaoEntregadorDto(avaliacaoEntregador));
	}

	@GetMapping("/{id_cliente}")
	public ResponseEntity<List<AvaliacaoEntregadorDto>> listarAvaliacaoEntregador(@PathVariable Integer id_cliente) {
		List<AvaliacaoEntregador> clientes = avaliacaoEntregadorService.listarPorCliente(id_cliente);
		List<AvaliacaoEntregadorDto> clientesDto = clientes.stream().map(AvaliacaoEntregadorDto::new).toList();
		return ResponseEntity.ok(clientesDto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirAvaliacaoEntregador(@PathVariable Integer id) {
		avaliacaoEntregadorService.excluirAvaliacaoEntregador(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<AvaliacaoEntregadorDto> atualizaAvaliacaoEntregador(
			@RequestBody AvaliacaoEntregadorDto AvaliacaoEntregadorDto) {
		AvaliacaoEntregador avaliacaoEntregador = avaliacaoEntregadorService
				.salvarAvaliacaoEntregador(AvaliacaoEntregadorDto);
		return ResponseEntity.ok(new AvaliacaoEntregadorDto(avaliacaoEntregador));
	}

}