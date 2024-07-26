package quetes;

import ressources.RessourcesTypes;

import java.util.ArrayList;
import java.util.List;

public class Quete {
    private List<QuetesTypes> quetes;
    private List<RessourcesTypes> ressourcesTypes;

    public Quete() {
        this.quetes = new ArrayList<>();
        this.ressourcesTypes = new ArrayList<>();
    }

    public void setQuete(QuetesTypes quete, RessourcesTypes ressources) {
        ressourcesTypes.add(ressources);
        quetes.add(quete);
        System.out.println("La quête " + quete + " permet de récupérer " + ressources);
    }
}
