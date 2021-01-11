package model;

/**
 * Class representing an announcement for encountering a Pet-Sitter or
 * an animal to be sitted at a specified time and location
 */
public class Notification {

    public String id;

    public Notification() {
        this.id = generateID();
    }

    /**
     * generates a new ID
     * @return ID
     */
    private String generateID() {
        double preId = Math.random() * Math.random() * 100_000_000;
        int id = (int) Math.floor(preId);
        return String.valueOf(id);
    }

}
