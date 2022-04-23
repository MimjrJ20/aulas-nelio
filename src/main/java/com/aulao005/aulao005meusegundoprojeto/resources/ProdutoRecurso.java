package com.aulao005.aulao005meusegundoprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aulao005.aulao005meusegundoprojeto.entities.ProdutoEntidade;
import com.aulao005.aulao005meusegundoprojeto.repositories.ProdutoRepositorio;

//CRIANDO ENTIDADE RECURSOS (O CONTROLLER)
@RestController
@RequestMapping(value = "/produtos")
public class ProdutoRecurso {
	
	//private ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio (); --> não recomendado, não é uma boa práica, pois não usa injeção de dependencia
	
	
	@Autowired//faz um pré processamento e já resolve a dependecia, vai automaticamente obter uma instancia da categoria repositorio
	private ProdutoRepositorio produtoRepositorio;//só funciona por causa do @Component que está lá no repository

	//MÉTODOS
	@GetMapping//define o caminho o qual ele vai responder http://localhost:8080/categorias
	public ResponseEntity<List<ProdutoEntidade>> findAll() 
	{
		//método hardcod
		//List<ProdutoEntidade> lista = new ArrayList<>();
		//lista.add(new ProdutoEntidade(1L, "Eletrônicos"));
		//lista.add(new ProdutoEntidade(2L, "Livros"));
		
		List<ProdutoEntidade> lista = produtoRepositorio.findAll();//vai acessar os dados, buscar e devolver na lista
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")//no caminho vou coloar barra e o número do id http://localhost:8080/categorias/1
	public ResponseEntity<ProdutoEntidade>findById(@PathVariable Long id)//essa anotação ela vai reconhecer o /1 e vai casar com a variavel id
	{
		
		//método hardcod
		//CategoriaEntidade categoria = new CategoriaEntidade(1L, "Eletrônicos");
		
		ProdutoEntidade produto = produtoRepositorio.findById(id);
		return ResponseEntity.ok().body(produto);
	}
}