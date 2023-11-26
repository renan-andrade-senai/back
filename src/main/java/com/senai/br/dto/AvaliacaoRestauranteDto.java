package com.senai.br.dto;

import com.senai.br.model.AvaliacaoRestaurante;

public class AvaliacaoRestauranteDto {

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

	public AvaliacaoRestauranteDto(Integer id, Integer nota, Integer id_restaurante, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.idRestaurante = id_restaurante;
		this.idCliente = id_cliente;
		this.descricao = desc;
	}

	public AvaliacaoRestauranteDto() {
		super();
	}

	public AvaliacaoRestauranteDto(AvaliacaoRestaurante avaliacaoRestaurante) {

		this.id = avaliacaoRestaurante.getId();
		this.idCliente = avaliacaoRestaurante.getIdCliente();
		this.idRestaurante = avaliacaoRestaurante.getIdRestaurante();
		this.nota = avaliacaoRestaurante.getNota();
		this.descricao = avaliacaoRestaurante.getDescricao();

	}

}
