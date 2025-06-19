package br.com.jna.sistema_loja.repositories;

import br.com.jna.sistema_loja.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
