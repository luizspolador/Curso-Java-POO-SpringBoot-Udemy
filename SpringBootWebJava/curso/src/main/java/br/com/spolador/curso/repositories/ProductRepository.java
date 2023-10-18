package br.com.spolador.curso.repositories;

import br.com.spolador.curso.entities.Product;
import br.com.spolador.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
