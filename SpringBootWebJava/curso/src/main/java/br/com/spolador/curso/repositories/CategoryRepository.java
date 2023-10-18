package br.com.spolador.curso.repositories;

import br.com.spolador.curso.entities.Category;
import br.com.spolador.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
