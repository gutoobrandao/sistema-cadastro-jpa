package br.com.jna.sistema_loja.repositories;

import br.com.jna.sistema_loja.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
