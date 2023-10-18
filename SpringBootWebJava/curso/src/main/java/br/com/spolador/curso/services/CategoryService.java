package br.com.spolador.curso.services;

import br.com.spolador.curso.entities.Category;
import br.com.spolador.curso.entities.Order;
import br.com.spolador.curso.repositories.CategoryRepository;
import br.com.spolador.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
