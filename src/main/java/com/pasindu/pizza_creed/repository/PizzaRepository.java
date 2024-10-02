package com.pasindu.pizza_creed.repository;

import com.pasindu.pizza_creed.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
