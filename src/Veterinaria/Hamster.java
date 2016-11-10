package Veterinaria;

public class Hamster extends Pet {

    private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    @Override
    public String Sound() {
        return "";
    }

    @Override
    public void Type() {
        System.out.println("Hamster");
    }

}
