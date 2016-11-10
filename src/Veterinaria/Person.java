package Veterinaria;

import java.util.ArrayList;

public class Person {

    private ArrayList<Pet> pets;
    private String name;
    private String id;

    public Person(String name, String id) {
        this.pets = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
