package unites.soldats;

import batiments.maison.SeReposer;
import unites.Unites;
import unites.SeDeplacer;

public class Soldat extends Unites implements SeReposer, SeDeplacer{
    public String name;

    public Soldat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void seRepose() {
        System.out.println(name + " se repose dans la caserne.");
    }

    @Override
    public void seDeplace() {
        System.out.println(name + " se déplace dans le village pour une mission à l'extérieur.");
    }
}
