package projeto.demo.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.demo.entity.Produto;
import projeto.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	

	    @Autowired
	    private ProdutoRepository repository;

	    public Produto salvar(Produto produto) {
	        return repository.save(produto);
	    }

	    public List<Produto> listar() {
	        return repository.findAll();
	    }

	    public Produto buscarPorId(Long id) {
	        return repository.findById(id).orElse(null);
	    }

	    public void deletar(Long id) {
	        repository.deleteById(id);
	    }
	}


