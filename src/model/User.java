package model;

/**
 * User Class
 * @author Oliver Mohn
 */

public abstract class User {

    public String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
