package br.com.jna.sistema_loja.services;

import br.com.jna.sistema_loja.entities.Order;
import br.com.jna.sistema_loja.entities.User;
import br.com.jna.sistema_loja.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findId(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
