package com.aulao005.aulao005meusegundoprojeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aulao005.aulao005meusegundoprojeto.entities.CategoriaEntidade;
import com.aulao005.aulao005meusegundoprojeto.repositories.CategoriaRepositorio;

@SpringBootApplication
public class Aulao005meusegundoprojetoApplication implements CommandLineRunner {//CommandLineRunner para instanciar categorias no startup da aplicação
	
	//
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Aulao005meusegundoprojetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		CategoriaEntidade categoria1 = new CategoriaEntidade(1L, "Eletrônicos");
		CategoriaEntidade categoria2 = new CategoriaEntidade(2L, "Book");
		
		categoriaRepositorio.save(categoria1);
		categoriaRepositorio.save(categoria2);
		
	}

}
