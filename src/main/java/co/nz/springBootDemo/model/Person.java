package co.nz.springBootDemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID uuid;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID uuid, @JsonProperty("name") String name){
        this.uuid = uuid;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
