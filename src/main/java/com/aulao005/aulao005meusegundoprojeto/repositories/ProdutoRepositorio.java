package com.aulao005.aulao005meusegundoprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulao005.aulao005meusegundoprojeto.entities.ProdutoEntidade;

//CRIANDO REPOSITORIO (ela vai ter acesso os dados)

@Repository
public interface ProdutoRepositorio extends JpaRepository<ProdutoEntidade, Long>{

	
}
/*
//método hardcode
@Component//é em relação ao meconismo de injeção do spring boot
public class ProdutoRepositorio {
	
	private Map<Long, ProdutoEntidade> mapa = new HashMap<>();//coleção de pares (chave para seu valor correspondente)
	
	
	public void save(ProdutoEntidade objeto)
	{
		mapa.put(objeto.getId(), objeto);
	}
	
	public ProdutoEntidade findById(Long id)
	{
		return mapa.get(id);
	}
	
	public List<ProdutoEntidade>findAll()
	{
		return new ArrayList<ProdutoEntidade>(mapa.values());
	}
}
*/
