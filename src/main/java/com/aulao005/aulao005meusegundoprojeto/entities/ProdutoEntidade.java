package com.aulao005.aulao005meusegundoprojeto.entities;

import java.io.Serializable;
import java.util.Objects;

//CRIANDO ENTIDADE CATEGORIA

public class ProdutoEntidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	private Long id;
	private String nome;
	private Double preco;
	
	//composição VÁROS produtos para UMA categoria
	
	private CategoriaEntidade categoria;
	
	public ProdutoEntidade() 
	{
		
	}

	public ProdutoEntidade(Long id, String nome, Double preco, CategoriaEntidade categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public CategoriaEntidade getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntidade categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoEntidade other = (ProdutoEntidade) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}
	
	
	
	
	

}
