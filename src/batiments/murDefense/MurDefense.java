package batiments.murDefense;

import batiments.Batiments;
import unites.soldats.Soldat;
import unites.SeDeplacer;

public class MurDefense extends Batiments implements SeDeplacer {
    private Soldat soldat;

    public MurDefense(Soldat soldat) {
        super("Mur de défense");
        this.soldat = soldat;
    }

    @Override
    public void seDeplace() {
        System.out.println(soldat + " va sur le mur de défense.");
    }
}
