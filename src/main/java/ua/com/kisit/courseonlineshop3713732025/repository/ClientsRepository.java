package ua.com.kisit.courseonlineshop3713732025.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.kisit.courseonlineshop3713732025.entity.Clients;

import java.util.List;

public interface ClientsRepository extends JpaRepository<Clients, Long> {

    List<Clients> findAllByUsername(String username);

    List<Clients> findAllByUsernameAndPassword(String username, String password);

    Clients findByUsername(String username);

}
