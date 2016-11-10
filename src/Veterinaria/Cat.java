package Veterinaria;

public class Cat extends Pet {

    private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public String Sound() {
        return "miau";
    }

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String toString() {
        return "Cat{" + "isHunter: " + isHunter + '}';
    }

    @Override
    public void Type() {
        System.out.println("Cat");
    }

}
