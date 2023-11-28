package com.senai.br.controller;

import java.util.List;
import java.util.Optional;

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

import com.senai.br.dto.AvaliacaoRestauranteDto;
import com.senai.br.model.AvaliacaoRestaurante;
import com.senai.br.service.AvaliacaoRestauranteService;

@RestController
@RequestMapping("/avaliacaoRestaurante")
public class AvaliacaoRestauranteController {

	@Autowired
	private AvaliacaoRestauranteService avaliacaoRestauranteService;

	@PostMapping
	public ResponseEntity<AvaliacaoRestauranteDto> cadastraAvaliacaoRestaurante(
			@RequestBody AvaliacaoRestauranteDto avaliacaoRestauranteDto) {
		AvaliacaoRestaurante avaliacaoRestaurante = avaliacaoRestauranteService
				.salvarAvaliacaoRestaurante(avaliacaoRestauranteDto);
		return ResponseEntity.ok(new AvaliacaoRestauranteDto(avaliacaoRestaurante));

	}

	

	
	@GetMapping("/{id}")
	public ResponseEntity<List<AvaliacaoRestauranteDto>> listarAvaliacaoRestaurantePorCliente(@PathVariable Integer id) {
		List<AvaliacaoRestaurante> clientes = avaliacaoRestauranteService.listarPorCliente(id);
		List<AvaliacaoRestauranteDto> clientesDto = clientes.stream().map(AvaliacaoRestauranteDto::new).toList();
		return ResponseEntity.ok(clientesDto);
	}
	
	@GetMapping("/porid/{id}")
	public ResponseEntity<AvaliacaoRestauranteDto> listarAvaliacaoRestaurantePorId(@PathVariable Integer id) {
		Optional<AvaliacaoRestaurante> avaliacao = avaliacaoRestauranteService.getAvaliacao(id);
		return ResponseEntity.ok(avaliacao.map(AvaliacaoRestauranteDto::new).orElse(new AvaliacaoRestauranteDto()));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirAvaliacaoRestaurante(@PathVariable Integer id) {
		avaliacaoRestauranteService.excluirAvaliacaoRestaurante(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<AvaliacaoRestauranteDto> atualizaAvaliacaoRestaurante(
			@RequestBody AvaliacaoRestauranteDto AvaliacaoRestauranteDto) {
		AvaliacaoRestaurante avaliacaoRestaurante = avaliacaoRestauranteService
				.salvarAvaliacaoRestaurante(AvaliacaoRestauranteDto);
		return ResponseEntity.ok(new AvaliacaoRestauranteDto(avaliacaoRestaurante));
	}

}
