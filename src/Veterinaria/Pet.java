package Veterinaria;

public abstract class Pet {

    private String id;
    private String name;
    private String hairColor;
    private String type;

    public abstract String Sound();

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }

    public abstract void Type();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

}
