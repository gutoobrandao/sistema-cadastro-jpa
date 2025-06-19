package br.com.jna.sistema_loja.services;

import br.com.jna.sistema_loja.entities.User;
import br.com.jna.sistema_loja.repositories.UserRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }


    public User findId(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
