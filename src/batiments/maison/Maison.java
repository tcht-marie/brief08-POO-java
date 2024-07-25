package batiments.maison;

import batiments.Batiments;
import unites.villageois.Villageois;

public class Maison extends Batiments  {
    private Villageois villageois;
    private String type;

    public Maison(Villageois villageois) {
        super("Maison");
        this.villageois = villageois;
        this.type = "Maison";
    }

    @Override
    public void seRepose() {
        System.out.println(villageois.name + " se repose.");
    }
}
