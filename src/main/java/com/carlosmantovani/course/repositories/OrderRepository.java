package com.carlosmantovani.course.repositories;

import com.carlosmantovani.course.entities.Order;
import com.carlosmantovani.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
