package projeto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.demo.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}