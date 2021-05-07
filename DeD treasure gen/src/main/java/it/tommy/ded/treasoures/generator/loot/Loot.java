package it.tommy.ded.treasoures.generator.loot;

import it.tommy.ded.treasoures.generator.coin.Coin;
import it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Loot {

    private List<GemsArt> gemsArts = new ArrayList<>();
    private List<Item> magickItems = new ArrayList<>();
    private Coin.MonetaRame monetaRame;
    private Coin.MonetaArgento monetaArgento;
    private Coin.MonetaEtereum monetaEtereum;
    private Coin.MonetaOro monetaOro;
    private Coin.MonetaPlatino monetaPlatino;


    public void addGemsArts(List<GemsArt> gemsArts){
        for(int i = 0; i< gemsArts.size(); i++)
            this.gemsArts.add(gemsArts.get(i));
    }

    public void addMagickItems(Collection<Item> items){
        magickItems.addAll(items);
    }

    public void setCoins(Coin.MonetaRame monetaRame, Coin.MonetaArgento monetaArgento, Coin.MonetaEtereum monetaEtereum, Coin.MonetaOro monetaOro, Coin.MonetaPlatino monetaPlatino)
    {
        this.monetaRame = monetaRame;
        this.monetaArgento = monetaArgento;
        this.monetaEtereum = monetaEtereum;
        this.monetaOro = monetaOro;
        this.monetaPlatino = monetaPlatino;
    }

    @Override
    public String toString() {
        return "Loot{" +"\n"+
                "gemsArts=" + gemsArts.toString() + "\n"+
                ", magickItems=" + magickItems.toString() +"\n"+
                ", monetaRame=" + monetaRame +"\n"+
                ", monetaArgento=" + monetaArgento +"\n"+
                ", monetaEtereum=" + monetaEtereum +"\n"+
                ", monetaOro=" + monetaOro +"\n"+
                ", monetaPlatino=" + monetaPlatino +"\n"+
                '}';
    }

    public List<GemsArt> getGemsArts() {
        return gemsArts;
    }

    public List<Item> getMagickItems() {
        return magickItems;
    }
}
