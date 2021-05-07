package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems1000GP implements GemsArt {
    OPALE_NERO ("OPALE NERO (VERDE SCURO TRASLUCIDO CON SCREZIATURE NERE E MACCHIE DORATE)"),
    ZAFFIRO_BLU ("ZAFFIRO BLU (DA BLU-BIANCO TRASPARENTE A BLU MEDIO)"),
    SMERALDO ("SMERALDO (VERDE INTENSO E BRILLANTE TRASPARENTE)"),
    OPALE_DI_FUOCO ("OPALE DI FUOCO (ROSSO FUOCO TRASLUCIDO)"),
    OPALE ("OPALE (BLU PALLIDO TRASLUCIDO CON SCREZIATURE VERDI E DORATE)"),
    RUBINO_A_STELLA ("RUBINO A STELLA (RUBINO TRASLUCIDO CON CENTRO BIANCO A FORMA DI STELLA)"),
    ZAFFIRO_STELLATO ("ZAFFIRO STELLATO (ZAFFIRO BLU TRASLUCIDO CON CENTRO A FORMA DI STELLA BIANCA)"),
    ZAFFIRO_GIALLO ("ZAFFIRO GIALLO (TRASPARENTE GIALLO FUOCO O GIALLOVERDE)");

    private final String descrizione;
    private static final int GP = 1000;

    Gems1000GP(String descrizione) {
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
