package batiments;

import batiments.interfaces.ProductionAliments;

public class Ferme extends Batiments implements ProductionAliments {

    public Ferme() {
        super("Ferme");
    }

    @Override
    public void agriculture() {
        System.out.println("Production de nourriture");
    }
}
