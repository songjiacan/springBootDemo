package co.nz.springBootDemo.dao;

import co.nz.springBootDemo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID uuid, Person person);

    default int insertPerson(Person person)
    {
        UUID uuid = UUID.randomUUID();
        return  insertPerson(uuid,person);
    }

    List<Person> selectAllPerson();

    Optional<Person> selectPersonById(UUID uuid);

    int deletePersonById(UUID uuid);

    int updatePersonById(UUID uuid, Person person);
}
