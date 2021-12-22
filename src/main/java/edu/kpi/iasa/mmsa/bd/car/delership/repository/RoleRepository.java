package edu.kpi.iasa.mmsa.bd.car.delership.repository;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Car;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Role;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findById(Long Id);
}
