package unites.artisan;

import batiments.atelier.Fabrication;
import unites.Unites;
import unites.villageois.Villageois;

public class Artisan extends Unites implements Fabrication {
    private Villageois villageois;

    public Artisan(Villageois villageois) {
        this.villageois = villageois;
    }

    @Override
    public void fabrication(String name) {
        System.out.println(this.villageois.name + " travail à l'atelier.");
    }

    @Override
    public void seDeplace() {
        System.out.println(this.villageois.name + " va à l'atelier.");
    }

    @Override
    public void seRepose() {
        System.out.println(villageois.name + " se repose après sa journée de travail.");
    }

}
