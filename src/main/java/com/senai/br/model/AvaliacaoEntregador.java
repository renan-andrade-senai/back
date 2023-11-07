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
	public AvaliacaoEntregador(Integer id, Integer nota, Integer id_Entregador, Integer id_Cliente, String desc) {
		super();
		this.id = id;
		this.nota = nota;
		this.id_entregador = id_Entregador;
		this.id_cliente = id_Cliente;
		this.desc = desc;
	}
	public AvaliacaoEntregador() {
		super();
	}
	
	public AvaliacaoEntregador(AvaliacaoEntregadorDto avaliacaoEntregadorDto ) {
		
		this.id = avaliacaoEntregadorDto.getId();
		this.id_cliente = avaliacaoEntregadorDto.getId_Cliente();
		this.id_entregador = avaliacaoEntregadorDto.getId_Entregador();
		this.nota = avaliacaoEntregadorDto.getNota();
		this.desc = avaliacaoEntregadorDto.getDesc();
		
	}
	
}
