package batiments;

import batiments.maison.SeReposer;
import unites.villageois.Villageois;

public abstract class Batiments implements SeReposer, Constructible {

    private String type;

    public Batiments(String type) {
        this.type = type;
    }

    @Override
    public void seRepose() {}

    @Override
    public void construire(Object constructeur) {
        if (constructeur instanceof Villageois) {
            System.out.println(((Villageois) constructeur).name + " a construit " + ".");
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
