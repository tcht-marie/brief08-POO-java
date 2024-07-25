package batiments.caserne;

import batiments.Batiments;
import unites.chef.Chef;
import unites.soldats.Soldat;

import java.util.ArrayList;
import java.util.List;

public class Caserne extends Batiments {
    public List<Soldat> soldats;
    public List<Chef> chefs;

    public Caserne() {
        super("Caserne");
        this.soldats = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    public void addSoldat(Soldat soldat) {
        soldats.add(soldat);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    @Override
    public String toString() {
        return "Caserne -> Chefs : " + chefs + " et ses soldats = " + soldats;
    }
}
