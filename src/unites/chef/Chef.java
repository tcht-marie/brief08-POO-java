package unites.chef;

import unites.Unites;

public class Chef extends Unites {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
