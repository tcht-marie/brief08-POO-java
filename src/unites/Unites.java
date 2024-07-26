package unites;

import batiments.interfaces.SeReposer;
import unites.interfaces.SeDeplacer;

public abstract class Unites implements SeDeplacer, SeReposer {

    @Override
    public void seDeplace() {
    }

    @Override
    public void seRepose() {
    }
}
