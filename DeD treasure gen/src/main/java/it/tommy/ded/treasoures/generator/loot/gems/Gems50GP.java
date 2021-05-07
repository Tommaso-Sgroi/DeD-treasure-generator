package it.tommy.ded.treasoures.generator.loot.gems;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Gems50GP implements GemsArt {
    ELIOTROPIA ("ELIOTROPIA (GRIGIO SCURO OPACO CON MACCHIE ROSSE)"),
    CORNIOLA ("CORNIOLA (DA ARANCIONE OPACO A MARRONE ROSSICCIO)"),
    CALCEDONIO ("CALCEDONIO (BIANCO OPACO)"),
    CRISOPRASIO ("CRISOPRASIO (VERDE TRASLUCIDO)"),
    CITRINO ("CITRINO (TRASPARENTE GIALLO CHIARO-MARRONE)"),
    DIASPRO ("DIASPRO (BLU OPACO, NERO O MARRONE)"),
    SELENITE ("SELENITE (BIANCO TRASLUCIDO CON BAGLIORE BLU PALLIDO)"),
    ONICE ("ONICE (BANDE OPACHE DI BIANCO E NERO, O NERO PURO O BIANCO)"),
    QUARZO ("QUARZO (BIANCO TRASPARENTE, GRIGIO FUMO O GIALLO)"),
    SARDONICE ("SARDONICE (BANDE OPACHE DI ROSSO E BIANCO)"),
    QUARZO_ROSA_STELLATO ("QUARZO ROSA STELLATO PIETRA ROSATA TRASLUCIDA CON CENTRO A FORMA DI STELLA BIANCA"),
    ZIRCONE ("ZIRCONE (AZZURRO-VERDE CHIARO TRASPARENTE)");

    private final String descrizione;
    private static final int GP = 50;

    Gems50GP(String descrizione) {
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
