package batiments.atelier;

import batiments.Batiments;

import java.util.ArrayList;
import java.util.List;

public class Atelier extends Batiments implements Fabrication{
    public List<Outil> outils;
    public List<Arme> armes;

    public Atelier() {
        super("Atelier");
        this.outils = new ArrayList<>();
        this.armes = new ArrayList<>();
    }

    public void addOutil(Outil outil) {
        outils.add(outil);
    }

    public void addArme(Arme arme) {
        armes.add(arme);
    }

    @Override
    public void fabrication(String name) {
        System.out.println(name + " fabriqué");
    }
}
