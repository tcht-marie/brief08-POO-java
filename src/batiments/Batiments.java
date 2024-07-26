package batiments;

import batiments.interfaces.Constructible;
import batiments.interfaces.SeReposer;
import unites.Villageois;

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
            System.out.println(((Villageois) constructeur).name + " a construit " + type + ".");
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
