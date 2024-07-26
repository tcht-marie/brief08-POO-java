import batiments.Caserne;
import batiments.Commerce;
import batiments.MurDefense;
import batiments.atelier.Arme;
import batiments.atelier.Atelier;
import batiments.atelier.Outil;
import batiments.Ferme;
import batiments.Maison;
import ressources.RessourcesTypes;
import unites.Chef;
import unites.Artisan;
import unites.Eclaireur;
import unites.Soldat;
import unites.Villageois;

public class Village {
    public static void main(String[] args) {
        // villageois
        Villageois jerome = new Villageois("Jerome");
        jerome.seDeplace();
        jerome.collecteRessources(RessourcesTypes.NOURRITURE);
        Villageois olivier = new Villageois("Olivier");
        Villageois sandrine = new Villageois("Sandrine");
        Villageois flavien = new Villageois("Flavien");

        // artisan
        Artisan olivierArtisan = new Artisan(olivier);
        Artisan flavienArtisan = new Artisan(flavien);
        olivierArtisan.seDeplace();
        olivierArtisan.fabrication(olivier.name);
        flavienArtisan.fabrication(flavien.name);

        //maison
        Maison maison = new Maison(jerome);
        maison.construire(jerome);
        maison.seRepose();

        // caserne
        Caserne caserne = new Caserne();
        caserne.construire(olivier);
        Soldat coralie = new Soldat("Coralie");
        Soldat charlotte = new Soldat("Charlotte");
        Chef caporalTiti = new Chef("Caporal Titi");
        Soldat omar = new Soldat("Omar");
        Soldat morgan = new Soldat("Morgan");

        caserne.addSoldat(coralie);
        caserne.addSoldat(charlotte);
        caserne.addChef(caporalTiti);
        caserne.addSoldat(omar);
        caserne.addSoldat(morgan);
        System.out.println(caserne);

        // soldats
        coralie.seDeplace();
        charlotte.seRepose();

        // éclaireur
        Eclaireur morganEclair = new Eclaireur(morgan);
        morganEclair.seDeplace();

        // ferme
        Ferme ferme = new Ferme();
        ferme.construire(jerome);
        ferme.agriculture();

        // atelier fabrication outils et armes
        Atelier atelier = new Atelier();
        atelier.construire(olivier);
        Outil marteau = new Outil("Marteau");
        Arme couteau = new Arme("Couteau");
        atelier.addOutil(marteau);
        atelier.addArme(couteau);
        atelier.fabrication(marteau.name());
        atelier.fabrication(couteau.name());

        // mur de défense
        MurDefense murDefense = new MurDefense(omar);
        murDefense.construire(flavien);
        murDefense.seDeplace();

        // commerce
        Commerce commerce = new Commerce();
        commerce.construire(sandrine);
        commerce.addRessource(RessourcesTypes.FER);
        commerce.addRessource(RessourcesTypes.BOIS);
        commerce.addRessource(RessourcesTypes.NOURRITURE);
        commerce.addRessource(RessourcesTypes.PIERRE);

        olivierArtisan.seRepose();
    }
}