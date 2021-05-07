package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems10GP implements GemsArt {
    AZZURRITE("AZZURRITE (BLU INTENSO SCREZIATO OPACO)"),
    AGATA_FASCIATA("AGATA FASCIATA (TRASLUCIDA A STRISCE MARRONI, BLU, BIANCHE O ROSSE)"),
    QUARZO("QUARZO BLU (AZZURRO CHIARO TRASPARENTE)"),
    AGATA_A_4_OCCHI("AGATA A 4 OCCHI (CERCHI TRASLUCIDI DI GRIGIO, BIANCO, MARRONE, BLU O VERDE)"),
    LAPISLAZZULI("LAPISLAZZULI (BLU CHIARO E SCURO OPACO CON MACCHIE GIALLE)"),
    MALACHITE("MALACHITE (OPACO STRIATO VERDE CHIARO E SCURO)"),
    AGATA_MUSCHIATA("AGATA MUSCHIATA (ROSA TRASLUCIDA O GIALLO-BIANCA CON SEGNI GRIGI O VERDI MUSCHIOSI)"),
    RODOCROSITE("RODOCROSITE (ROSA CHIARO OPACO)"),
    OCCHIO_DI_TIGRE("OCCHIO DI TIGRE (MARRONE TRASLUCIDO CON CENTRO DORATO)"),
    TURCHESE("TURCHESE (AZZURRO-VERDE OPACO)");

    private final String descrizione;
    private final static int GP = 10;
    Gems10GP(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione(){return descrizione;}
    public int getGp(){return GP;}

    @Override
    public String toString() {
        return GP + ": "+descrizione;
    }
}
