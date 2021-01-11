package model;

/**
 * Abstract Profile Class
 *
 * @author Oliver Mohn
 */
public abstract class Profile {
    private String name;
    private Picture profilePicture;
    private User user;

    /**
     * Constructor 1
     * @param user User
     */
    public Profile(User user) {
        this.user = user;
    }

    /**
     * Constructor 2
     * @param name name
     * @param profilePicture profilePicture
     * @param user User
     */
    public Profile(String name, Picture profilePicture, User user) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.user = user;
    }

    /**
     * Method does what it says
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method sets Name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get Profile Picture
     * @return Picture profilePicture
     */
    public Picture getProfilePicture() {
        return profilePicture;
    }

    /**
     * sets Profile Picture
     * @param profilePicture profilePicture
     */
    public void setProfilePicture(Picture profilePicture) {
        this.profilePicture = profilePicture;
    }

    /**
     * Prints "Notification published."
     */
    public void publishNotification() {
        System.out.println("Notification published.");
    }
}
