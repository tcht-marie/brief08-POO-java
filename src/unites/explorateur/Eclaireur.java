package unites.explorateur;

import batiments.maison.SeReposer;
import unites.SeDeplacer;
import unites.Unites;
import unites.soldats.Soldat;

public class Eclaireur extends Unites implements SeDeplacer, SeReposer {
    private Soldat soldat;

    public Eclaireur(Soldat soldat) {
        this.soldat = soldat;
    }

    @Override
    public void seDeplace() {
        System.out.println(soldat.name + " part en éclaireur.");
    }

    @Override
    public void seRepose() {
        System.out.println(soldat.name + " est rentré de sa mission et se repose dans sa maison.");
    }
}
