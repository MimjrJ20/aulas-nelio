package com.aulao005.aulao005meusegundoprojeto.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.aulao005.aulao005meusegundoprojeto.entities.CategoriaEntidade;

//CRIANDO REPOSITORIO (ela vai ter acesso os dados)

@Component//é em relação ao meconismo de injeção do spring boot
public class CategoriaRepositorio {
	
	private Map<Long, CategoriaEntidade> mapa = new HashMap<>();//coleção de pares (chave para seu valor correspondente)
	
	public void save(CategoriaEntidade objeto)
	{
		mapa.put(objeto.getId(), objeto);
	}
	
	public CategoriaEntidade findById(Long id)
	{
		return mapa.get(id);
	}
	
	public List<CategoriaEntidade>findAll()
	{
		return new ArrayList<CategoriaEntidade>(mapa.values());
	}
}
