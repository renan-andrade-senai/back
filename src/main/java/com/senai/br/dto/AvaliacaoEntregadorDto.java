package com.senai.br.dto;

import com.senai.br.model.AvaliacaoEntregador;

public class AvaliacaoEntregadorDto {

	private Integer id;
	private Integer nota;
	private Integer id_entregador;
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
	public AvaliacaoEntregadorDto(Integer id, Integer nota, Integer id_entregador, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.id_entregador = id_entregador;
		this.id_cliente = id_cliente;
		this.desc = desc;
	}
	public Integer getId_Entregador() {
		return id_entregador;
	}
	public void setId_Entregador(Integer id_Entregador) {
		this.id_entregador = id_Entregador;
	}
	public Integer getId_Cliente() {
		return id_cliente;
	}
	public void setId_Cliente(Integer id_Cliente) {
		this.id_cliente = id_Cliente;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public AvaliacaoEntregadorDto() {
		super();
	}
	
public AvaliacaoEntregadorDto(AvaliacaoEntregador avaliacaoEntregador ) {
		
		this.id = avaliacaoEntregador.getId();
		this.id_cliente = avaliacaoEntregador.getId_Cliente();
		this.id_entregador = avaliacaoEntregador.getId_Entregador();
		this.nota = avaliacaoEntregador.getNota();
		this.desc = avaliacaoEntregador.getDesc();
		
	}
	
}
