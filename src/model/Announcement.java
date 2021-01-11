package model;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * represents an announcement made by a user
 */
public class Announcement implements Observable {

    public String id;

    private User owner;
    private User partner;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    private boolean signed;

    public boolean isSigned() {
        return signed;
    }

    private String announcementText;
    private Date start;
    private Date end;
    private String location;
    private List<InvalidationListener> fluffyViews = new ArrayList<>();

    /**
     * Contructor
     * @param announcementText Anzeigentext
     * @param owner Tierbesitzer
     * @param pet Haustier
     */
    public Announcement(String announcementText, User owner, Pet pet) {
        this.announcementText = announcementText;
        this.owner = owner;
        this.pet = pet;
        this.signed = false;
    }

    public Announcement(User owner) {
        this.owner = owner;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getAnnouncementText() {
        return announcementText;
    }

    /**
     * sets text of notification
     * @param announcementText Anzeigentext
     */
    public String setAnnouncementText(String announcementText) {
        return this.announcementText = announcementText;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getLocation() {
        return location;
    }

    /**
     * sets location
     * @param location Wohnort bzw. Ort des Tieraufenthaltes
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public List<InvalidationListener> getFluffyViews() {
        return fluffyViews;
    }

    public void setFluffyViews(List<InvalidationListener> fluffyViews) {
        this.fluffyViews = fluffyViews;
    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {
        fluffyViews.add(invalidationListener);
    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {
        fluffyViews.remove(invalidationListener);
    }

    /**
     * Contract is getting signed
     * returns signed = true in case of success
     * @param partner Vertragspartner also hier der Tierpfleger
     * @return signed
     */
    public boolean signContract(User partner) {
        if (signed) {
            throw new IllegalStateException("Das Tier hat bereits seinen Teilzeitpfleger gefunden.");
        }
        this.partner = partner;
        setSigned(true);
        return signed;
    }
}
