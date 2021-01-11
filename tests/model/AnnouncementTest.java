package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnnouncementTest {

    Pet pet1;
    Pet pet2;
    Pet pet3;

    Holder holder1;
    Holder holder2;
    Holder holder3;

    Keeper keeper1;
    Keeper keeper2;

    Announcement announcement01;
    Announcement announcement02;
    Announcement announcement03;

    @Before
    public void setUp() throws Exception {

        // Instanziierung einiger Testobjekte
        pet1 = new Pet("p001", "Kater Casimir", PetRace.CAT);
        pet2 = new Pet("p002", "Barkey", PetRace.DOG);
        pet3 = new Pet("p003", "Pieper", PetRace.BIRD);

        holder1 = new Holder("h001", "Tim Thaler", pet1);
        holder2 = new Holder("h002", "Susi Strolch", pet2);
        holder3 = new Holder("h003", "Frank Vogelnarr", pet3);

        keeper1 = new Keeper("k001", "Tom Tierfreund");
        keeper2 = new Keeper("k002", "Birgit Brauchtbeschäftigung");

        announcement01 = new Announcement(holder1);
        announcement02 = new Announcement(holder2);
        announcement03 = new Announcement("Suche eine netten Menschen, der sich um Pieper kümmert", holder3, pet3);
    }

    @Test
    public void getAnnouncementText() {
        assertNull("Should be null", announcement01.getAnnouncementText());
        assertNull("Should be null", announcement02.getAnnouncementText());
        assertEquals("Suche eine netten Menschen, der sich um Pieper kümmert",
                "Suche eine netten Menschen, der sich um Pieper kümmert",
                announcement03.getAnnouncementText());

    }

    @Test
    public void setAnnouncementText() {
        assertEquals("\"Suche Pflege für meinen Hund Barkey\" erwartet",
                "Suche Pflege für meinen Hund Barkey",
                announcement01.setAnnouncementText("Suche Pflege für meinen Hund Barkey"));

    }

    @Test
    public void signContract() {
        assertTrue("Has to be true after signing.", announcement01.signContract(keeper1));

    }


    // Testet auf Exception

    @Test
    public void signContractWhenAlreadySigned() {
        announcement02.signContract(keeper1);
        assertThrows("IllegalStateException erwartet.", IllegalStateException.class, () -> announcement02.signContract(keeper2));
    }
    @Test
    public void signContractWhenAlreadySigned2() {

        announcement02.setSigned(true);

        try {
            announcement02.signContract(keeper1);
            fail("Sollte eigentlich eine Exception werfen.");
        } catch (IllegalStateException e) {
            System.out.println("Couldn't sign contract because seems to be already signed.");
        }

    }

    @Test
    public void isSigned() {
        assertFalse("False if not signed", announcement02.isSigned());

    }

    @Test
    public void getPet() {
        assertEquals("Der Vogel 'Pieper' wird erwartet.", pet3, announcement03.getPet());
    }
}