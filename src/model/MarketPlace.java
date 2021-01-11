package model;

import java.util.ArrayList;
import java.util.List;

/**
 * MarketPlace Klasse
 */
public class MarketPlace {

    private List<Announcement> announcements = new ArrayList<>();

    public void addAnnouncement(Announcement announcement) {
        announcements.add(announcement);
    }

    public void deleteAnnouncement(Announcement announcement) {
        System.out.println("Announcement deleted");
    }

    @Override
    public String toString() {
        return "MarketPlace{" +
                "announcements=" + announcements.toString() +
                '}';
    }
}
