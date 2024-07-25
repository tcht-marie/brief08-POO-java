package unites.villageois;

import ressources.RessourcesTypes;
import unites.SeDeplacer;
import unites.Unites;

import java.util.ArrayList;
import java.util.List;

public class Villageois extends Unites implements Collecter, SeDeplacer {
    public String name;
    private List<RessourcesTypes> ressources;

    public Villageois(String name) {
        this.name = name;
        this.ressources = new ArrayList<>();
    }

    @Override
    public void collecteRessources(RessourcesTypes ressourcesTypes) {
        ressources.add(ressourcesTypes);
        System.out.println(name + " a collecté : " + ressourcesTypes);
    }

    @Override
    public void seDeplace() {
        System.out.println(name + " se balade dans le village.");
    }

}
