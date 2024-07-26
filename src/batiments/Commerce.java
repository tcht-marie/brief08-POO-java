package batiments;

import ressources.RessourcesTypes;

import java.util.ArrayList;
import java.util.List;

public class Commerce extends Batiments {
    private List<RessourcesTypes> ressources;
    private String type;

    public Commerce() {
        super("Commerce");
        this.ressources = new ArrayList<>();
        this.type = "Commerce";
    }

    public void addRessource(RessourcesTypes ressourcesTypes) {
        ressources.add(ressourcesTypes);
        System.out.println("Ressource " + ressourcesTypes + " ajoutée dans le stock du " + type );
        //System.out.println("Ressources disponibles : " + this.ressources);
    }
}
