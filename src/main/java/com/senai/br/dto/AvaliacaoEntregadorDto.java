package com.senai.br.dto;

import com.senai.br.model.AvaliacaoEntregador;

public class AvaliacaoEntregadorDto {

	private Integer id;
	private Integer nota;
	private Integer idEntregador;
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

	public AvaliacaoEntregadorDto(Integer id, Integer nota, Integer id_entregador, Integer id_cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.idEntregador = id_entregador;
		this.idCliente = id_cliente;
		this.descricao = desc;
	}

	public Integer getIdEntregador() {
		return idEntregador;
	}

	public void setIdEntregador(Integer idEntregador) {
		this.idEntregador = idEntregador;
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

	public AvaliacaoEntregadorDto() {
		super();
	}

	public AvaliacaoEntregadorDto(AvaliacaoEntregador avaliacaoEntregador) {

		this.id = avaliacaoEntregador.getId();
		this.idCliente = avaliacaoEntregador.getIdCliente();
		this.idEntregador = avaliacaoEntregador.getIdEntregador();
		this.nota = avaliacaoEntregador.getNota();
		this.descricao = avaliacaoEntregador.getDescricao();

	}

}
