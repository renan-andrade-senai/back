package com.senai.br.model;

import com.senai.br.dto.AvaliacaoRestauranteDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AvaliacaoRestaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer nota;
	private Integer idRestaurante;
	private Integer idCliente;
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(Integer idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String desc) {
		this.descricao = desc;
	}

	public AvaliacaoRestaurante(Integer id, Integer nota, Integer id_restaurante, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.idRestaurante = id_restaurante;
		this.idCliente = id_cliente;
		this.descricao = desc;
	}

	public AvaliacaoRestaurante() {
		super();
	}

	public AvaliacaoRestaurante(AvaliacaoRestauranteDto avaliacaoRestauranteDto) {

		this.id = avaliacaoRestauranteDto.getId();
		this.idCliente = avaliacaoRestauranteDto.getIdCliente();
		this.idRestaurante = avaliacaoRestauranteDto.getIdRestaurante();
		this.nota = avaliacaoRestauranteDto.getNota();
		this.descricao = avaliacaoRestauranteDto.getDescricao();

	}

}
