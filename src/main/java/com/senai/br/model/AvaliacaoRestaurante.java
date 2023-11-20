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
	private Integer id_restaurante;
	private Integer id_cliente;
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
	public Integer getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(Integer id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
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
		this.id_restaurante = id_restaurante;
		this.id_cliente = id_cliente;
		this.descricao = desc;
	}
	public AvaliacaoRestaurante() {
		super();
	}
	
public AvaliacaoRestaurante(AvaliacaoRestauranteDto avaliacaoRestauranteDto ) {
		
		this.id = avaliacaoRestauranteDto.getId();
		this.id_cliente = avaliacaoRestauranteDto.getId_cliente();
		this.id_restaurante = avaliacaoRestauranteDto.getId_restaurante();
		this.nota = avaliacaoRestauranteDto.getNota();
		this.descricao = avaliacaoRestauranteDto.getDescricao();
		
	}
	
}
