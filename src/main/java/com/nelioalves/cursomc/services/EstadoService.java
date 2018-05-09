package com.nelioalves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	@Autowired
	private CidadeService cidadeService;
	
	
	public List<Estado> findAllByOrderByNome(){
		return repo.findAllByOrderByNome();
	}
	
	public List<Cidade> findCidades(Integer id){
		Estado estado = repo.getOne(id);
		return cidadeService.findAllByOrderByNome(estado);
	}
	
}
