package com.aulao005.aulao005meusegundoprojeto.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

//CRIANDO ENTIDADE CATEGORIA

@Entity//que ela é uma entidade gerenciada pelo JPA, ou seja uma tabilidade
public class CategoriaEntidade implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;//id padrão
	
	
	//ATRIBUTOS
	@Id//esse atributo é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incrementavel no banco
	private Long id;//para que o tipo aceite todos recursos de herança e polimorfismos da poo
	private String nome;
	
	
	//COMPOSIÇÃO
	@JsonIgnore//não entrar em looping
	@OneToMany(mappedBy = "categoria")//mapear o atributo categoria
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
