package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Necessário inserir o nome do jogo.")
	private String nome;
	
	@NotBlank(message = "Necessário inserir quais plataforma é adequado para esse jogo")
	private String plataforma;
	
	@NotNull
	private double preco;
	
	@NotBlank(message = "Neessário inserir o nome da empresa que criou o jogo.")
	private String empresaCriador;

	@ManyToOne
	@JsonIgnoreProperties("jogo")
	private Categoria categoria;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getEmpresaCriador() {
		return empresaCriador;
	}

	public void setEmpresaCriador(String empresaCriador) {
		this.empresaCriador = empresaCriador;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
