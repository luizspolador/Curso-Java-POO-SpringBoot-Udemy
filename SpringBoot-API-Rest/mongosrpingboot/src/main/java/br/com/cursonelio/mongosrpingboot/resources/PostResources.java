package br.com.cursonelio.mongosrpingboot.resources;

import br.com.cursonelio.mongosrpingboot.domain.entities.Post;
import br.com.cursonelio.mongosrpingboot.domain.entities.User;
import br.com.cursonelio.mongosrpingboot.dto.UserDTO;
import br.com.cursonelio.mongosrpingboot.resources.util.URL;
import br.com.cursonelio.mongosrpingboot.services.PostService;
import br.com.cursonelio.mongosrpingboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity <Post> findById(@PathVariable String id){ // para casar com o id recebido na url
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/titlesearch")
    public ResponseEntity <List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text){
        text = URL.decodePara(text); // decodifica o parametro
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/fullsearch")
    public ResponseEntity <List<Post>> fullSearch(@RequestParam(value = "text", defaultValue = "") String text,
                                                  @RequestParam(value = "minDate", defaultValue = "") String minDate,
                                                  @RequestParam(value = "maxDate", defaultValue = "") String maxDate){
        text = URL.decodePara(text); // decodifica o parametro
        Date min = URL.convertDate(minDate, new Date(0L));
        Date max = URL.convertDate(maxDate, new Date());
        List<Post> list = service.fullSearch(text, min, max);
        return ResponseEntity.ok().body(list);
    }


}
