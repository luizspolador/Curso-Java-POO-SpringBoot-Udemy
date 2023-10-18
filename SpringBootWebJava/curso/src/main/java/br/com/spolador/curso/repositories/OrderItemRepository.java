package br.com.spolador.curso.repositories;

import br.com.spolador.curso.entities.OrderItem;
import br.com.spolador.curso.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
