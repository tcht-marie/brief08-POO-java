package batiments;

import unites.Soldat;
import unites.interfaces.SeDeplacer;

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
