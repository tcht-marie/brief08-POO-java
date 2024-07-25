import batiments.Batiments;
import batiments.caserne.Caserne;
import batiments.commerce.Commerce;
import batiments.murDefense.MurDefense;
import batiments.atelier.Arme;
import batiments.atelier.Atelier;
import batiments.atelier.Outil;
import batiments.ferme.Ferme;
import batiments.maison.Maison;
import ressources.RessourcesTypes;
import unites.chef.Chef;
import unites.artisan.Artisan;
import unites.explorateur.Eclaireur;
import unites.soldats.Soldat;
import unites.Unites;
import unites.villageois.Villageois;

public class Village {
    public static void main(String[] args) {
        // villageois
        Unites jerome = new Villageois("Jerome");
        ((Villageois) jerome).seDeplace();
        ((Villageois) jerome).collecteRessources(RessourcesTypes.NOURRITURE);
        Unites olivier = new Villageois("Olivier");
        Unites sandrine = new Villageois("Sandrine");
        Unites flavien = new Villageois("Flavien");

        // artisan
        Unites olivierArtisan = new Artisan((Villageois) olivier);
        Unites flavienArtisan = new Artisan((Villageois) flavien);
        olivierArtisan.seDeplace();
        ((Artisan) olivierArtisan).fabrication(((Villageois) olivier).name);
        ((Artisan) flavienArtisan).fabrication(((Villageois) flavien).name);

        //maison
        Batiments maison = new Maison((Villageois) jerome);
        maison.construire(jerome);
        maison.seRepose();

        // caserne
        Batiments caserne = new Caserne();
        caserne.construire(olivier);
        Unites coralie = new Soldat("Coralie");
        Unites charlotte = new Soldat("Charlotte");
        Unites caporalTiti = new Chef("Caporal Titi");
        Unites omar = new Soldat("Omar");
        Unites morgan = new Soldat("Morgan");

        ((Caserne) caserne).addSoldat((Soldat) coralie);
        ((Caserne) caserne).addSoldat((Soldat) charlotte);
        ((Caserne) caserne).addChef((Chef) caporalTiti);
        ((Caserne) caserne).addSoldat((Soldat) omar);
        ((Caserne) caserne).addSoldat((Soldat) morgan);
        System.out.println(caserne);

        // soldats
        ((Soldat) coralie).seDeplace();
        ((Soldat) charlotte).seRepose();

        // éclaireur
        Unites morganEclair = new Eclaireur((Soldat) morgan);
        ((Eclaireur) morganEclair).seDeplace();

        // ferme
        Batiments ferme = new Ferme();
        ferme.construire(jerome);
        ((Ferme) ferme).agriculture();

        // atelier fabrication outils et armes
        Batiments atelier = new Atelier();
        atelier.construire(olivier);
        Outil marteau = new Outil("Marteau");
        Arme couteau = new Arme("Couteau");
        ((Atelier) atelier).addOutil(marteau);
        ((Atelier) atelier).addArme(couteau);
        ((Atelier) atelier).fabrication(marteau.name());
        ((Atelier) atelier).fabrication(couteau.name());

        // mur de défense
        Batiments murDefense = new MurDefense((Soldat) omar);
        murDefense.construire(flavien);
        ((MurDefense) murDefense).seDeplace();

        // commerce
        Batiments commerce = new Commerce();
        commerce.construire(sandrine);
        ((Commerce) commerce).addRessource(RessourcesTypes.FER);
        ((Commerce) commerce).addRessource(RessourcesTypes.BOIS);
        ((Commerce) commerce).addRessource(RessourcesTypes.NOURRITURE);
        ((Commerce) commerce).addRessource(RessourcesTypes.PIERRE);

        olivierArtisan.seRepose();
    }
}