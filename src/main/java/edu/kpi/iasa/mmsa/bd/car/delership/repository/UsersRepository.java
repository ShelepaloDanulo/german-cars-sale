package edu.kpi.iasa.mmsa.bd.car.delership.repository;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findById(Long Id);
    Users findByFirstName(String firstName);
}
