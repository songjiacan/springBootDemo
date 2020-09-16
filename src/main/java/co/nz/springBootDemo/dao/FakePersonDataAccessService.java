package co.nz.springBootDemo.dao;

import co.nz.springBootDemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID uuid, Person person) {
        DB.add(new Person(uuid,person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPerson() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {
        return DB.stream()
                .filter(person -> person.getUuid().equals(uuid))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID uuid) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID uuid, Person personForUpdate) {
        return  selectPersonById(uuid)
                .map(person -> {
                    int index = DB.indexOf(person);
                    if (index >= 0)
                    {
                        DB.set(index, new Person(uuid, personForUpdate.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
