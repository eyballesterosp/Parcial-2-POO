package Veterinaria;

public class Dog extends Pet {

    private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    @Override
    public void Type() {
        System.out.println("Dog");;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String Sound() {
        return "guau";
    }

}
