package projeto.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import projeto.demo.entity.Produto;
import projeto.demo.service.ProdutoService;

@RestController
@RequestMapping("/produtos")

public class ProdutosController {
	
	    @Autowired
	    private ProdutoService service;

	    @PostMapping
	    public Produto criar(@RequestBody Produto produto) {
	        return service.salvar(produto);
	    }

	    @GetMapping
	    public List<Produto> listar() {
	        return service.listar();
	    }

	    @GetMapping("/{id}")
	    public Produto buscar(@PathVariable Long id) {
	        return service.buscarPorId(id);
	    }

	    @DeleteMapping("/{id}")
	    public void deletar(@PathVariable Long id) {
	        service.deletar(id);
	    }
}

	    
	    
	    


