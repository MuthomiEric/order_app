package com.learnspring.learnspring.repository;
import java.util.UUID;
import com.learnspring.learnspring.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
