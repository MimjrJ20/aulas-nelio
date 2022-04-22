package com.aulao005.aulao005meusegundoprojeto.entities;

import java.io.Serializable;
import java.util.Objects;

//CRIANDO ENTIDADE CATEGORIA

public class CategoriaEntidade implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;//id padrão
	
	
	//ATRIBUTOS
	private Long id;//para que o tipo aceite todos recursos de herança e polimorfismos da poo
	private String nome;
	
	
	//CONSTRUTOR (vazio) 
	public CategoriaEntidade()
	{
		
	}

	//CONTRUTORES
	public CategoriaEntidade(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	//GET AND SET
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//ANOTAÇÕES critério personalizado de comparações (direito - source - generte hash and code)
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaEntidade other = (CategoriaEntidade) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
