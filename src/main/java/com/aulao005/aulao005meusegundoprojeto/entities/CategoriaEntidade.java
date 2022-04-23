package com.aulao005.aulao005meusegundoprojeto.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

//CRIANDO ENTIDADE CATEGORIA

public class CategoriaEntidade implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;//id padrão
	
	
	//ATRIBUTOS
	private Long id;//para que o tipo aceite todos recursos de herança e polimorfismos da poo
	private String nome;
	
	
	//COMPOSIÇÃO
	@JsonIgnore//não entrar em looping
	private List<ProdutoEntidade> produtos = new ArrayList<>();
	
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
	
	//GET PRODUTOS acessar a lista de produtos
	
	public List<ProdutoEntidade> getProdutos() {
		return produtos;
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
