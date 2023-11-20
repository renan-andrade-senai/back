package com.senai.br.model;

import com.senai.br.dto.AvaliacaoEntregadorDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AvaliacaoEntregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer nota;
	private Integer id_entregador;
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
	public Integer getId_entregador() {
		return id_entregador;
	}
	public void setId_entregador(Integer id_Entregador) {
		this.id_entregador = id_Entregador;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_Cliente) {
		this.id_cliente = id_Cliente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	public AvaliacaoEntregador(Integer id, Integer nota, Integer id_Entregador, Integer id_Cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.id_entregador = id_Entregador;
		this.id_cliente = id_Cliente;
		this.descricao = desc;
	}
	public AvaliacaoEntregador() {
		super();
	}
	
	public AvaliacaoEntregador(AvaliacaoEntregadorDto avaliacaoEntregadorDto ) {
		
		this.id = avaliacaoEntregadorDto.getId();
		this.id_cliente = avaliacaoEntregadorDto.getId_cliente();
		this.id_entregador = avaliacaoEntregadorDto.getId_entregador();
		this.nota = avaliacaoEntregadorDto.getNota();
		this.descricao = avaliacaoEntregadorDto.getDescricao();
		
	}
	
}
