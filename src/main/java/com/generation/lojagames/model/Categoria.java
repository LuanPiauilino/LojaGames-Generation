package com.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Necessário inserir o nome do tema da categoria.")
	private String tema;

	@NotNull(message = "Necessário inserir a idade sugerida dessa categoria.")
	private int idadeSugerida;

	@NotNull(message = "Necessário inserir o ano de lançamento médio dessa categoria.")
	private int anoMedia;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Jogo> jogo;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getIdadeSugerida() {
		return idadeSugerida;
	}

	public void setIdadeSugerida(int idadeSugerida) {
		this.idadeSugerida = idadeSugerida;
	}

	public int getAnoMedia() {
		return anoMedia;
	}

	public void setAnoMedia(int anoMedia) {
		this.anoMedia = anoMedia;
	}
	
	public List<Jogo> getJogo() {
		return jogo;
	}

	public void setJogo(List<Jogo> jogo) {
		this.jogo = jogo;
	}
}
