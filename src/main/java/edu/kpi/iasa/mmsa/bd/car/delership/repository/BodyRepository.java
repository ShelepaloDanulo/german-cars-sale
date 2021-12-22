package edu.kpi.iasa.mmsa.bd.car.delership.repository;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Body;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BodyRepository extends JpaRepository<Body,Long> {
    Optional<Body> findById(Long Id);
}
