package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems5000GP implements GemsArt {
    ZAFFIRO_NERO ("ZAFFIRO NERO (NERO BRILLANTE TRASLUCIDO CON RIFLESSI LUMINOSI)"),
    DIAMANTE ("DIAMANTE (TRASPARENTE BLU-BIANCO, CANARINO, ROSA, MARRONE O BLU)"),
    GIACINTO ("GIACINTO (ARANCIO ARDENTE TRASPARENTE)"),
    RUBINO ("RUBINO (DA ROSSO CHIARO TRASPARENTE A CREMISI INTENSO)");

    private final String descrizione;
    private static final int GP = 5000;

    Gems5000GP(String descrizione) {
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
