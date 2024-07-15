package model;

/**
 * A FalseTVSZ osztály a hamis TVSZ működését és viselkedését modellezi.
 * A TVSZhez hasonlóan működik, azt leszámítva, hogy nem nyújt védelmet a kibukással szemben.
 * A TVSZ leszármazottja.
 */
public class FalseTVSZ extends TVSZ{

    /**
     * A FalseTVSZ osztály konstruktora.
     * Létrehoz és inicializás egy FalseTVSZ objektumot.
     *
     * @param location a szoba, amiben a tárgy van
     * @param holder a személy, akinél a tárgy van
     */
    public FalseTVSZ(Room location, Person holder){
        super(location, holder);
    }

    /**
     * Kibukás elleni védelem kérése
     * Nem nyújt védelmet a kibukással szemben.
     * @return {@code false} minden esetben
     */
    @Override
    public boolean saveFromDeath(Person killer) {
        super.saveFromDeath(killer);
        return false;
    }
}
