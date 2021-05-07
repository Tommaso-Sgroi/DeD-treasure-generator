package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems100GP implements GemsArt {
    AMBRA ("AMBRA (DALL' ORO ACQUOSO TRASPARENTE A ORO INTESNO)"),
    AMETISTA ("AMETISTA (VIOLA INTENSO TRASPARENTE)"),
    CRISOBERILLO ("CRISOBERILLO (TRASPARENTE DA GIALLO-VERDE A VERDE CHIARO)"),
    CORALLO ("CORALLO (CREMISI OPACO)"),
    GRANATO ("GRANATO (ROSSO TRASPARENTE, MARRONE-VERDE O VIOLA)"),
    GIADA ("GIADA (VERDE CHIARO TRASLUCIDO, VERDE INTENSO O BIANCO)"),
    GIAIETTO ("GIAIETTO (NERO PROFONDO OPACO)"),
    PERLA ("PERLA (OPACA BRILLANTE BIANCO, GIALLO O ROSA)"),
    SPINELLO ("SPINELLO (ROSSO TRASPARENTE, ROSSO-MARRONE O VERDE INTENSO)"),
    TORMALINA ("TORMALINA (TRASPARENTE VERDE CHIARO, BLU, MARRONE O ROSSO)");

    private final String descrizione;
    private static final int GP = 100;

    Gems100GP(String descrizione) {
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
