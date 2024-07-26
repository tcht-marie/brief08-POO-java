import batiments.Caserne;
import batiments.Commerce;
import batiments.MurDefense;
import batiments.atelier.Arme;
import batiments.atelier.Atelier;
import batiments.atelier.Outil;
import batiments.Ferme;
import batiments.Maison;
import quetes.QuetesTypes;
import ressources.RessourcesTypes;
import unites.Chef;
import unites.Artisan;
import unites.Eclaireur;
import unites.Soldat;
import unites.Villageois;
import quetes.Quete;

public class Village {
    public static void main(String[] args) {
        // villageois
        // création de villageois
        Villageois jerome = new Villageois("Jerome");
        // un villageois peut se déplacer
        jerome.seDeplace();
        // un villageois peut récupérer des ressources
        jerome.collecteRessources(RessourcesTypes.NOURRITURE);

        Villageois olivier = new Villageois("Olivier");
        Villageois sandrine = new Villageois("Sandrine");
        Villageois flavien = new Villageois("Flavien");

        // artisan
        // création d'un artisan (c'est un villageois aussi)
        Artisan olivierArtisan = new Artisan(olivier);
        Artisan flavienArtisan = new Artisan(flavien);
        // les artisans peuvent aussi se déplacer
        olivierArtisan.seDeplace();
        // les artisans travaillent à l'atelier
        olivierArtisan.fabrication(olivier.name);
        flavienArtisan.fabrication(flavien.name);

        //maison
        // création d'une maison
        Maison maison = new Maison(jerome);
        // un villageois peut construire sa maison
        maison.construire(jerome);
        // un villageois peut se reposer
        maison.seRepose();

        // caserne
        // création d'une caserne
        Caserne caserne = new Caserne();
        // construction de la caserne
        caserne.construire(olivier);
        // création d'un soldat
        Soldat coralie = new Soldat("Coralie");
        Soldat charlotte = new Soldat("Charlotte");
        // création d'un chef
        Chef caporalTiti = new Chef("Caporal Titi");
        Soldat omar = new Soldat("Omar");
        Soldat morgan = new Soldat("Morgan");

        // soldats et chef dans la caserne
        caserne.addSoldat(coralie);
        caserne.addSoldat(charlotte);
        caserne.addChef(caporalTiti);
        caserne.addSoldat(omar);
        caserne.addSoldat(morgan);
        System.out.println(caserne);

        // soldats
        // les soldats peuvent se reposer et se déplacer
        coralie.seDeplace();
        charlotte.seRepose();

        // éclaireur
        // création d'un éclaireur
        Eclaireur morganEclair = new Eclaireur(morgan);
        // un éclaireur peut se déplacer
        morganEclair.seDeplace();

        // ferme
        // création d'une ferme
        Ferme ferme = new Ferme();
        // construction de la ferme
        ferme.construire(jerome);
        // la ferme peut produire de la nourriture
        ferme.agriculture();

        // atelier fabrication outils et armes
        // création d'un atelier
        Atelier atelier = new Atelier();
        // construction de l'atelier
        atelier.construire(olivier);
        // création d'un outil
        Outil marteau = new Outil("Marteau");
        // création d'une arme
        Arme couteau = new Arme("Couteau");
        atelier.addOutil(marteau);
        atelier.addArme(couteau);
        // fabrication de l'outil et de l'arme
        atelier.fabrication(marteau.name());
        atelier.fabrication(couteau.name());

        // mur de défense
        // création, construction du mur de défense
        MurDefense murDefense = new MurDefense(omar);
        murDefense.construire(flavien);

        // commerce
        // création et construction d'un commerce
        Commerce commerce = new Commerce();
        commerce.construire(sandrine);
        // ajout de ressources dans le commerce
        commerce.addRessource(RessourcesTypes.FER);
        commerce.addRessource(RessourcesTypes.BOIS);
        commerce.addRessource(RessourcesTypes.NOURRITURE);
        commerce.addRessource(RessourcesTypes.PIERRE);

        olivierArtisan.seRepose();

        // quêtes
        // création de quêtes
        Quete quete1 = new Quete();
        quete1.setQuete(QuetesTypes.COLLECTER, RessourcesTypes.NOURRITURE);

        Quete quete2 = new Quete();
        quete2.setQuete(QuetesTypes.CONSTRUIRE, RessourcesTypes.OUTIL);
    }
}