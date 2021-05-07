package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems500GP implements GemsArt {
    ALESSANDRITE ("ALESSANDRITE (VERDE SCURO TRASPARENTE)"),
    ACQUAMARINA ("ACQUAMARINA (AZZURRO-VERDE CHIARO TRASPARENTE)"),
    PERLA_NERA ("PERLA NERA (NERO PURO OPACO)"),
    SPINELLO_BLU ("SPINELLO BLU (BLU PROFONDO TRASPARENTE)"),
    PERIDOTO ("PERIDOTO (VERDE OLIVA INTENSO TRASPARENTE)"),
    TOPAZIO ("TOPAZIO (GIALLO DORATO TRASPARENTE)");

    private final String descrizione;
    private static final int GP = 500;

    Gems500GP(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getGp() {
        return GP;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public String toString() {
        return GP + ": "+descrizione;
    }
}
