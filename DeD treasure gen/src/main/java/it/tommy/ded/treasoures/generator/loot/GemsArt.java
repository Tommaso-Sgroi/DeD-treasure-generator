package it.tommy.ded.treasoures.generator.loot;

import it.tommy.ded.treasoures.generator.loot.artobjects.*;
import it.tommy.ded.treasoures.generator.loot.gems.*;

public interface GemsArt {

    int getGp();
    String getDescrizione();

    static GemsArt[] getGemsArt(GemsArtType gemsArtType){
        if(gemsArtType!=null)
            return switch(gemsArtType)
            {
                case ART25 -> Art25GP.values();
                case ART250 -> Art250GP.values();
                case ART750 -> Art750GP.values();
                case ART2500 -> Art2500GP.values();
                case ART7500 -> Art7500GP.values();
                case GEMS10 -> Gems10GP.values();
                case GEMS50 -> Gems50GP.values();
                case GEMS100 -> Gems100GP.values();
                case GEMS500 -> Gems500GP.values();
                case GEMS1000 -> Gems1000GP.values();
                case GEMS5000 -> Gems5000GP.values();
                default -> null;
            };
        return null;
    }
}
