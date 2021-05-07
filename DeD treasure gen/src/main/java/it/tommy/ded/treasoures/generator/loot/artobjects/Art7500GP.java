package it.tommy.ded.treasoures.generator.loot.artobjects;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Art7500GP implements GemsArt  {

    CORONA_D_ORO_INGIOIELLATA(" CORONA D'ORO INGIOIELLATA"),
    ANELLO_DI_PLATINO_INGIOIELLATO(" ANELLO DI PLATINO INGIOIELLATO"),
    PICCOLA_STATUETTA_IN_ORO_CON_RUBINI(" PICCOLA STATUETTA IN ORO CON RUBINI"),
    COPPA_D_ORO_CON_SMERALDI(" COPPA D'ORO CON SMERALDI"),
    PORTAGIOIE_IN_ORO_CON_FILIGRANA_DI_PLATINO(" PORTAGIOIE IN ORO CON FILIGRANA DI PLATINO"),
    SARCOFAGO_DA_BAMBINO_IN_ORO_DIPINTO(" SARCOFAGO DA BAMBINO IN ORO DIPINTO"),
    TAVOLO_DA_GIOCO_IN_GIADA_CON_PEZZI_DA_GIOCO_IN_ORO_MASSICCIO(" TAVOLO DA GIOCO IN GIADA CON PEZZI DA GIOCO IN ORO MASSICCIO"),
    CORNO_DA_BERE_IN_AVORIO_GIOIELLO_CON_FILIGRANA_D_ORO(" CORNO DA BERE IN AVORIO GIOIELLO CON FILIGRANA D'ORO");

    private final String descrizione;
    private final static int GP = 7500;
    Art7500GP(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione(){return descrizione;}
    public int getGp(){return GP;}

    @Override
    public String toString() {
        return GP + ": "+descrizione;
    }
}
