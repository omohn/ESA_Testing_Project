import model.Holder;
import model.Keeper;
import model.Pet;
import model.PetRace;

public class FluffyVacation {

    public static void main(String[] args) {

        // Instanziierung einiger Testobjekte
        Pet pet1 = new Pet("p001", "Kater Casimir", PetRace.CAT);
        Pet pet2 = new Pet("p002", "Barkey", PetRace.DOG);
        Pet pet3 = new Pet("p003", "Pieper", PetRace.BIRD);

        Holder holder1 = new Holder("h001", "Tim Thaler", pet1);
        Holder holder2 = new Holder("h002", "Susi Strolch", pet2);
        Holder holder3 = new Holder("h003", "Frank Vogelnarr", pet3);

        Keeper keeper1 = new Keeper("k001", "Tom Tierfreund");
        Keeper keeper2 = new Keeper("k002", "Birgit Brauchtbeschäftigung");


    }
}
