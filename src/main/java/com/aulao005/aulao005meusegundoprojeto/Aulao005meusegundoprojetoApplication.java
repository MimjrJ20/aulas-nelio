package com.aulao005.aulao005meusegundoprojeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aulao005.aulao005meusegundoprojeto.entities.CategoriaEntidade;
import com.aulao005.aulao005meusegundoprojeto.entities.ProdutoEntidade;
import com.aulao005.aulao005meusegundoprojeto.repositories.CategoriaRepositorio;
import com.aulao005.aulao005meusegundoprojeto.repositories.ProdutoRepositorio;

@SpringBootApplication
public class Aulao005meusegundoprojetoApplication implements CommandLineRunner {//CommandLineRunner para instanciar categorias no startup da aplicação
	
		
	@Autowired//resolver a dependencia
	private CategoriaRepositorio categoriaRepositorio;
	
	@Autowired//resolver a dependencia
	private ProdutoRepositorio produtoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Aulao005meusegundoprojetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		CategoriaEntidade categoria1 = new CategoriaEntidade(1L, "Eletrônicos");
		CategoriaEntidade categoria2 = new CategoriaEntidade(2L, "Livros");
		
		ProdutoEntidade produto1 = new ProdutoEntidade(1L, "TV", 2500.00, categoria1);
		ProdutoEntidade produto2 = new ProdutoEntidade(2L, "Domain Driven Design", 150.00, categoria2);
		ProdutoEntidade produto3 = new ProdutoEntidade(3L, "PS5", 5000.00, categoria1);
		ProdutoEntidade produto4 = new ProdutoEntidade(4L, "Docker", 200.00, categoria2);
		
		categoria1.getProdutos().addAll(Arrays.asList(produto1, produto3));
		categoria2.getProdutos().addAll(Arrays.asList(produto2, produto4));
		
		categoriaRepositorio.save(categoria1);
		categoriaRepositorio.save(categoria2);
		
		produtoRepositorio.save(produto1);
		produtoRepositorio.save(produto2);
		produtoRepositorio.save(produto3);
		produtoRepositorio.save(produto4);
		
	}

}
