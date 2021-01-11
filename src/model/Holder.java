package model;

public class Holder extends User {

    private Pet pet;

    public Holder(String id, String name, Pet pet) {
        super(id, name);
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}