package model;

public class Pet {

    private String id;
    private String name;
    private PetRace race;

    public Pet(String id, String name, PetRace race) {
        this.id = id;
        this.name = name;
        this.race = race;
    }

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

    public PetRace getRace() {
        return race;
    }

    public void setRace(PetRace race) {
        this.race = race;
    }
}
