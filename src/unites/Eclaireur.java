package unites;

public class Eclaireur extends Unites {
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
