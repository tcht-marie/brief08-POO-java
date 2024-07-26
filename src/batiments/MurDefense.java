package batiments;

import unites.Soldat;
import unites.interfaces.SeDeplacer;

public class MurDefense extends Batiments {
    private Soldat soldat;

    public MurDefense(Soldat soldat) {
        super("Mur de défense");
        this.soldat = soldat;
    }
}
