package ua.osadchuk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.osadchuk.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
