package br.com.jna.sistema_loja.services;

import br.com.jna.sistema_loja.entities.Product;
import br.com.jna.sistema_loja.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findId( Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
