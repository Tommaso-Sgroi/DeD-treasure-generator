package it.tommy.ded.treasoures.generator.cumulo_di_tesori;

import it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables.MagickItemTable;
import it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables.MagickItemTableType;
import it.tommy.ded.treasoures.generator.dice.Dice;
import it.tommy.ded.treasoures.generator.dice.DiceType;
import it.tommy.ded.treasoures.generator.loot.GemsArt;
import it.tommy.ded.treasoures.generator.loot.GemsArtType;
import it.tommy.ded.treasoures.generator.loot.Loot;

import java.util.List;


public class ItemCumuloDiTesori implements Comparable{

    private int min;
    private int max;
    private int throwsForGemsArt;
    private int throwsForMagickItems;
    private GemsArt[] gemsArts;
    private DiceType diceForGemsArt, diceForItemTable;
    private MagickItemTable magickItemTable;

    public ItemCumuloDiTesori(int min, int max, GemsArtType gemsArtType, String diceForGemsArt, MagickItemTableType magickItemTableType, String diceForItemTable) {
        this.min = min;
        this.max = max;
        this.gemsArts = GemsArt.getGemsArt(gemsArtType);
        this.magickItemTable = MagickItemTable.getTableInstance(magickItemTableType);
        if (diceForGemsArt != null)
        {
            var d = diceForGemsArt.split("d");
            throwsForGemsArt = Integer.parseInt(d[0]);
            this.diceForGemsArt = DiceType.valueOf("D" + d[1]);
        }
        if (diceForItemTable != null)
        {
            var d = diceForItemTable.split("d");
            throwsForMagickItems = Integer.parseInt(d[0]);
            this.diceForItemTable = DiceType.valueOf("D" + d[1]);
        }
    }

    public Loot generateItems(){
        Dice diceForGemsArt = null;
        Dice gemsArtDice = null;
        if(this.diceForGemsArt!=null)
        {
            diceForGemsArt = new Dice(this.diceForGemsArt);
            gemsArtDice = new Dice(DiceType.valueOf("D"+gemsArts.length));
        }

        Loot loot = new Loot();
        for(int i = 0; i<throwsForGemsArt; i++)
            for(int i1 = 0; i1<diceForGemsArt.throwDice(); i1++)
                loot.addGemsArts(List.of(gemsArts[gemsArtDice.throwDice()-1]));

        Dice diceForMagickItems = null;
        if(this.diceForItemTable!=null)
            diceForMagickItems = new Dice(diceForItemTable);

        for(int i = 0; i<throwsForMagickItems; i++)
            loot.addMagickItems(magickItemTable.generateItems(diceForMagickItems.throwDice()));

        return loot;
    }

    public int getMin() { return min; }

    public int getMax() { return max; }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ItemCumuloDiTesori)
        {
            ItemCumuloDiTesori itemCumuloDiTesori = (ItemCumuloDiTesori) o;
            if(min< itemCumuloDiTesori.min) return -1;
            else if(min> itemCumuloDiTesori.min) return 1;
            return 0;
        }
        else if(o instanceof Integer)
        {
            int i = (Integer) o;
            if(max< i) return -1;
            else if(min> i) return 1;
            return 0;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "ItemCumuloDiTesori{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
