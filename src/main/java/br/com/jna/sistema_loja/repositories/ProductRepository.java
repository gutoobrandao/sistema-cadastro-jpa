package br.com.jna.sistema_loja.repositories;

import br.com.jna.sistema_loja.entities.Category;
import br.com.jna.sistema_loja.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
