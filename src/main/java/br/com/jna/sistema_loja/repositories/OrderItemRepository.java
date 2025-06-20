package br.com.jna.sistema_loja.repositories;

import br.com.jna.sistema_loja.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
