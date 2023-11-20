package com.senai.br.dto;

import com.senai.br.model.AvaliacaoEntregador;

public class AvaliacaoEntregadorDto {

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
	public AvaliacaoEntregadorDto(Integer id, Integer nota, Integer id_entregador, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.id_entregador = id_entregador;
		this.id_cliente = id_cliente;
		this.descricao = desc;
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
	public AvaliacaoEntregadorDto() {
		super();
	}
	
public AvaliacaoEntregadorDto(AvaliacaoEntregador avaliacaoEntregador ) {
		
		this.id = avaliacaoEntregador.getId();
		this.id_cliente = avaliacaoEntregador.getId_cliente();
		this.id_entregador = avaliacaoEntregador.getId_entregador();
		this.nota = avaliacaoEntregador.getNota();
		this.descricao = avaliacaoEntregador.getDescricao();
		
	}
	
}
