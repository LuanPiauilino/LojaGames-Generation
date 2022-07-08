package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Necessário inserir o nome do tema da categoria.")
	private String Tema;

	@NotNull(message = "Necessário inserir a idade sugerida dessa categoria.")
	private int idadeSugerida;

	@NotNull(message = "Necessário inserir o ano de lançamento médio dessa categoria.")
	private int anoMedia;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String tema) {
		Tema = tema;
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
}
