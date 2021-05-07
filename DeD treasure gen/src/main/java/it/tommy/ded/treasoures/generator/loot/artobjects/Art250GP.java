package it.tommy.ded.treasoures.generator.loot.artobjects;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Art250GP implements GemsArt {
    ANELLO_IN_ORO_CON_PIETRE_SANGUIGNE("ANELLO IN ORO CON PIETRE SANGUIGNE"),
    STATUETTA_IN_AVORIO_INTAGLIATO("STATUETTA IN AVORIO INTAGLIATO"),
    BRACCIALE_IN_ORO_ROSA("BRACCIALE IN ORO ROSA"),
    COLLANA_IN_ARGENTO_CON_PENDENTE_IN_PIETRA_PREZIOSA("COLLANA IN ARGENTO CON PENDENTE IN PIETRA PREZIOSA"),
    CORONA_IN_BRONZO("CORONA IN BRONZO"),
    VESTAGLIA_IN_SETA_CON_RICAMO_ORO("VESTAGLIA IN SETA CON RICAMO ORO"),
    GRANDE_TAPPEZZERIA_BEN_REALIZZATA("GRANDE TAPPEZZERIA BEN REALIZZATA"),
    TAZZA_IN_OTTONE_CON_INTARSIO_IN_GIADA("TAZZA IN OTTONE CON INTARSIO IN GIADA"),
    SCATOLA_DI_FIGURE_ANIMATE_TURCHESI("SCATOLA DI FIGURE ANIMATE TURCHESI"),
    GABBIA_PER_UCCELLI_IN_ORO_CON_FILIGRANA_IN_ELECTRUM("GABBIA PER UCCELLI IN ORO CON FILIGRANA IN ELECTRUM");

    private final String descrizione;
    private final static int GP = 250;
    Art250GP(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione(){return descrizione;}
    public int getGp(){return GP;}

    @Override
    public String toString() {
        return GP + ": "+descrizione;
    }
}
