package br.com.spolador.curso.repositories;

import br.com.spolador.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
