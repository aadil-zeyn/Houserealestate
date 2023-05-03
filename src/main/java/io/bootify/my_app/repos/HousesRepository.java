package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Houses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HousesRepository extends JpaRepository<Houses, Integer> {
    List<Houses> findByZipCode(String zip);
}
