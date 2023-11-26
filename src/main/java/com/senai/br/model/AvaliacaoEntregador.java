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

	public AvaliacaoEntregador(Integer id, Integer nota, Integer id_Entregador, Integer id_Cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.idEntregador = id_Entregador;
		this.idCliente = id_Cliente;
		this.descricao = desc;
	}

	public AvaliacaoEntregador() {
		super();
	}

	public AvaliacaoEntregador(AvaliacaoEntregadorDto avaliacaoEntregadorDto) {

		this.id = avaliacaoEntregadorDto.getId();
		this.idCliente = avaliacaoEntregadorDto.getIdCliente();
		this.idEntregador = avaliacaoEntregadorDto.getIdEntregador();
		this.nota = avaliacaoEntregadorDto.getNota();
		this.descricao = avaliacaoEntregadorDto.getDescricao();

	}

}
