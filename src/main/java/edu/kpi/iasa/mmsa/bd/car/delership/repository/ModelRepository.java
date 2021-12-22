package edu.kpi.iasa.mmsa.bd.car.delership.repository;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {
    Optional<Model> findById(Long Id);
}
