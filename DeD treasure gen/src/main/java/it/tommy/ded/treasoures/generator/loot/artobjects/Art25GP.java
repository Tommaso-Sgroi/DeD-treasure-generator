package it.tommy.ded.treasoures.generator.loot.artobjects;

import it.tommy.ded.treasoures.generator.loot.GemsArt;

public enum Art25GP implements GemsArt {
    BROCCA_D_ARGENTO("BROCCA D'ARGENTO"),
    STATUETTE_IN_OSSO_INTAGLIATO("STATUETTE IN OSSO INTAGLIATO"),
    PICCOLO_BRACCIALE_IN_ORO("PICCOLO BRACCIALE IN ORO"),
    PARAMENTI_IN_STOFFA_D_ORO("PARAMENTI IN STOFFA D'ORO"),
    MASCHERA_IN_VELLUTO_NERO_CUCITA_CON_FILO_D_ARGENTO_CALICE_IN_RAME_CON_FILIGRANA_D_ARGENTO("MASCHERA IN VELLUTO NERO CUCITA CON FILO D'ARGENTO CALICE IN RAME CON FILIGRANA D'ARGENTO"),
    COPPIA_DI_DADI_IN_OSSO_INCISI("COPPIA DI DADI IN OSSO INCISI"),
    PICCOLO_SPECCHIO_INCASTONATO_IN_UNA_CORNICE_DI_LEGNO_DIPINTO_FAZZOLETTO_IN_SETA_RICAMATA("PICCOLO SPECCHIO INCASTONATO IN UNA CORNICE DI LEGNO DIPINTO FAZZOLETTO IN SETA RICAMATA"),
    MEDAGLIONE_D_ORO_CON_UN_RITRATTO_DIPINTO_ALL_INTERNO("MEDAGLIONE D'ORO CON UN RITRATTO DIPINTO ALL'INTERNO");

    private final String descrizione;
    private final static int GP = 25;
    Art25GP(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione(){return descrizione;}
    @Override
    public int getGp(){return GP;}

    @Override
    public String toString() {
        return GP + ": "+descrizione;
    }
}
