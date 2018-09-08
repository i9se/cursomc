package com.inovese.uml.services;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inovese.uml.domain.Categoria;
import com.inovese.uml.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
			java.util.Optional<Categoria> obj = repo.findById(id);
			return (Categoria) obj.orElse(null);
	}

}
