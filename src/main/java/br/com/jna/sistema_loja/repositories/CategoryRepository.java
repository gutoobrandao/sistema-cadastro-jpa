package br.com.jna.sistema_loja.repositories;

import br.com.jna.sistema_loja.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
