package br.com.cursonelio.mongosrpingboot.repository;

import br.com.cursonelio.mongosrpingboot.domain.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }") // ?0 -> primeiro parametro do metodo (nesse caso = text)
    // i -> ignora letra maiusc ou minusc
    List<Post> searchTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text); // pesquisa post que contem a string passada pelo parametro
    //IgnoreCase -> ignora letra maiusc ou minusc

    //DOS METODOS ACIMA: USAR UM OU OUTRO


    //Buscar posts contendo um dado string em qualquer lugar (no título, corpo ou comentários) e em um dado
    //intervalo de datas
    @Query("{ $and: [ { date: {$gte: ?1} }, { date: {$lte: ?2} }, { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] }")
    List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
