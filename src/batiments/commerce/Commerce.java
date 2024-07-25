package batiments.commerce;

import batiments.Batiments;
import ressources.RessourcesTypes;

import java.util.ArrayList;
import java.util.List;

public class Commerce extends Batiments {
    private List<RessourcesTypes> ressources;

    public Commerce() {
        super("Commerce");
        this.ressources = new ArrayList<>();
    }

    public void addRessource(RessourcesTypes ressourcesTypes) {
        ressources.add(ressourcesTypes);
        System.out.println("Ressource ajoutée dans le stock du commerce. " + ressourcesTypes);
        //System.out.println("Ressources disponibles : " + this.ressources);
    }
}
