package br.com.jna.sistema_loja.services;

import br.com.jna.sistema_loja.entities.Category;
import br.com.jna.sistema_loja.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findId(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
