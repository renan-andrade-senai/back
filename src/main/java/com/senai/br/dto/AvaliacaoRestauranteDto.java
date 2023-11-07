package com.senai.br.dto;

import com.senai.br.model.AvaliacaoRestaurante;

public class AvaliacaoRestauranteDto {

	private Integer id;
	private Integer nota;
	private Integer id_restaurante;
	private Integer id_cliente;
	private String desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public AvaliacaoRestauranteDto(Integer id, Integer nota, Integer id_restaurante, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.id_restaurante = id_restaurante;
		this.id_cliente = id_cliente;
		this.desc = desc;
	}
	public AvaliacaoRestauranteDto() {
		super();
	}
	
public AvaliacaoRestauranteDto(AvaliacaoRestaurante avaliacaoRestaurante ) {
		
		this.id = avaliacaoRestaurante.getId();
		this.id_cliente = avaliacaoRestaurante.getId_cliente();
		this.id_restaurante = avaliacaoRestaurante.getId_restaurante();
		this.nota = avaliacaoRestaurante.getNota();
		this.desc = avaliacaoRestaurante.getDesc();
		
	}
	
}
