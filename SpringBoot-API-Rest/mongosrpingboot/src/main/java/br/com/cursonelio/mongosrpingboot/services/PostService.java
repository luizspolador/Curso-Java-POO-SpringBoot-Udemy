package br.com.cursonelio.mongosrpingboot.services;

import br.com.cursonelio.mongosrpingboot.domain.entities.Post;
import br.com.cursonelio.mongosrpingboot.domain.entities.User;
import br.com.cursonelio.mongosrpingboot.dto.UserDTO;
import br.com.cursonelio.mongosrpingboot.repository.PostRepository;
import br.com.cursonelio.mongosrpingboot.repository.UserRepository;
import br.com.cursonelio.mongosrpingboot.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

//    public List<Post> findByTitle(String text){
//        return repository.findByTitleContainingIgnoreCase(text);
//    }
    // USAR O METODO COMENTADO ACIMA OU O ABAIXO
    public List<Post> findByTitle(String text){
        return repository.searchTitle(text);
    }

    //Buscar posts contendo um dado string em qualquer lugar (no título, corpo ou comentários) e em um dado
    //intervalo de datas
    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repository.fullSearch(text, minDate, maxDate);
    }

}
