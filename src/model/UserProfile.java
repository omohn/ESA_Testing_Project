package model;

public class UserProfile extends Profile {

    private String[] hobbies;
    private Picture[] galery;
    private Object[] posts;

    public UserProfile(User user) {
        super(user);
    }

    public UserProfile(String name, Picture profilePicture, User user) {
        super(name, profilePicture, user);
    }

    public UserProfile(User user, String[] hobbies, Picture[] galery, Object[] posts) {
        super(user);
        this.hobbies = hobbies.clone();
        this.galery = galery.clone();
        this.posts = posts.clone();
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby) {
        // toDo
    }

    public void addPicture(Picture picture) {
        // toDo
    }

    public void addPost(Object post) {
        // toDo
    }
}
