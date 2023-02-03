package io.github.maxsanttos.course.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.maxsanttos.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order,Long>{
    
    

}
