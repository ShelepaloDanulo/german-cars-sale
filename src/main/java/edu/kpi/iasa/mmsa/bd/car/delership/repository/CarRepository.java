package edu.kpi.iasa.mmsa.bd.car.delership.repository;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Car;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    Optional<Car> findById(Long Id);
}
