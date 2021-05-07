package it.tommy.ded.treasoures.generator.cumulo_di_tesori;

import it.tommy.ded.treasoures.generator.coin.Coin;
import it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables.MagickItemTableType;
import it.tommy.ded.treasoures.generator.dice.Dice;
import it.tommy.ded.treasoures.generator.dice.DiceType;
import it.tommy.ded.treasoures.generator.loot.GemsArtType;
import it.tommy.ded.treasoures.generator.loot.Loot;

import java.util.ArrayList;

public abstract class CumuloTesori {

    protected static final Dice D100 = new Dice(DiceType.D100);

    protected Coin.MonetaRame monetaRame;
    protected Coin.MonetaArgento monetaArgento;
    protected Coin.MonetaEtereum monetaEtereum;
    protected Coin.MonetaOro monetaOro;
    protected Coin.MonetaPlatino monetaPlatino;

    private transient ArrayList<ItemCumuloDiTesori> cumuloTesori;

    private static CumuloTesori04 cumuloTesori04;
    private static CumuloDitesori510 cumulotesori510;
    private static CumuloTesori1116 cumuloTesori1116;
    private static CumuloTesori17 cumuloTesori17;

    private CumuloTesori(){
        cumuloTesori = buildTable();
        resettaTesori();
    }

    public final static CumuloTesori getCumuloTesori04(){
        if(cumuloTesori04==null)
            cumuloTesori04 = new CumuloTesori04();
        return cumuloTesori04;
    }

    public final static CumuloTesori getCumuloTesori510(){
        if(cumulotesori510==null)
            cumulotesori510 = new CumuloDitesori510();
        return cumulotesori510;
    }

    public final static CumuloTesori getCumuloTesori1116(){
        if(cumuloTesori1116==null)
            cumuloTesori1116 = new CumuloTesori1116();
        return cumuloTesori1116;
    }

    public final static CumuloTesori getCumuloTesori17(){
        if(cumuloTesori17==null)
            cumuloTesori17 = new CumuloTesori17();
        return cumuloTesori17;
    }

    protected abstract ArrayList<ItemCumuloDiTesori> buildTable();
    protected abstract void generateCoins();

    public void resettaTesori(){
        monetaRame = new Coin.MonetaRame(0);
        monetaArgento = new Coin.MonetaArgento(0);
        monetaEtereum = new Coin.MonetaEtereum(0);
        monetaOro = new Coin.MonetaOro(0);
        monetaPlatino = new Coin.MonetaPlatino(0);
    }

    public Loot generaTesori(){
        resettaTesori();
        generateCoins();
        Loot loot = extractLoot(D100.throwDice());
        loot.setCoins(monetaRame,monetaArgento,monetaEtereum,monetaOro,monetaPlatino);
        return loot;
    }

    public Loot extractLoot(int result){
        return getItems(result).generateItems();
    }

    protected ItemCumuloDiTesori getItems(int result){
        int min = 0;
        int max = cumuloTesori.size()-1;

        while(min<=max)
        {
            int med = (max+min)/2;
            ItemCumuloDiTesori itemCumuloDiTesori = cumuloTesori.get(med);
            int flag = itemCumuloDiTesori.compareTo(result);
            if(flag>0)
                max = med-1;
            else if(flag<0)
                min = med+1;
            else
            {
                return cumuloTesori.get(med);
            }
        }
        return null;
    }



    public ArrayList<ItemCumuloDiTesori> getCumuloTesori() {
        return cumuloTesori;
    }

    private static class CumuloTesori04 extends CumuloTesori {


        @Override
        protected void generateCoins() {
            Dice d6 = new Dice(DiceType.D6);
            int quantity = 0;
            for(int i = 0; i<6; i++)
                quantity+=d6.throwDice();
            monetaRame.setQuantita(quantity*100);

            quantity = 0;
            for(int i = 0; i<3; i++)
                quantity+=d6.throwDice();
            monetaArgento.setQuantita(quantity*100);

            quantity = 0;
            for(int i = 0; i<2; i++)
                quantity+=d6.throwDice();
            monetaOro.setQuantita(quantity*10);
        }

        @Override
        protected ArrayList<ItemCumuloDiTesori> buildTable() {
            ArrayList<ItemCumuloDiTesori> array = new ArrayList<>(18);
            array.add(new ItemCumuloDiTesori(-1, -1, null, null, null, null));
            array.add(new ItemCumuloDiTesori(1,6, null, null, null, null));
            array.add(new ItemCumuloDiTesori(7, 16, GemsArtType.GEMS10, "2d6", null, null));
            array.add(new ItemCumuloDiTesori(17, 26, GemsArtType.ART25, "2d4", null, null));
            array.add(new ItemCumuloDiTesori(27, 36, GemsArtType.GEMS50, "2d6", null, null));
            array.add(new ItemCumuloDiTesori(37, 44, GemsArtType.GEMS10, "2d6", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(45, 52, GemsArtType.ART25, "2d4", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(53, 60, GemsArtType.GEMS50, "2d6", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(61, 65, GemsArtType.GEMS10, "2d6", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(66, 70, GemsArtType.ART25, "2d4", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(71, 75, GemsArtType.GEMS50, "2d6", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(76, 78, GemsArtType.GEMS10, "2d6", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(79, 80, GemsArtType.ART25, "2d4", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(81, 85, GemsArtType.GEMS50, "2d6", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(86, 92, GemsArtType.ART25, "2d4", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(93, 97, GemsArtType.GEMS50, "2d6", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(98, 99, GemsArtType.ART25, "2d4", MagickItemTableType.G, "1d1"));
            array.add(new ItemCumuloDiTesori(100, 100, GemsArtType.GEMS50, "2d6", MagickItemTableType.G, "1d1"));
            return array;
        }
    }

    private static class CumuloDitesori510 extends CumuloTesori{


        @Override
        protected void generateCoins() {
            Dice d6 = new Dice(DiceType.D6);
            int quantity = 0;
            for(int i = 0; i<2; i++)
                quantity+=d6.throwDice();
            monetaRame.setQuantita(quantity*100);

            quantity = 0;
            for(int i = 0; i<2; i++)
                quantity+=d6.throwDice();
            monetaArgento.setQuantita(quantity*1000);

            quantity = 0;
            for(int i = 0; i<6; i++)
                quantity+=d6.throwDice();
            monetaOro.setQuantita(quantity*100);

            quantity = 0;
            for(int i = 0; i<3; i++)
                quantity+=d6.throwDice();
            monetaPlatino.setQuantita(quantity*10);
        }

        @Override
        protected ArrayList<ItemCumuloDiTesori> buildTable() {
            ArrayList<ItemCumuloDiTesori> array = new ArrayList<>(30);
            array.add(new ItemCumuloDiTesori(-1, -1, null, null, null, null));
            array.add(new ItemCumuloDiTesori(1,4, null, null, null, null));
            array.add(new ItemCumuloDiTesori(5, 10, GemsArtType.ART25, "2d4", null, null));
            array.add(new ItemCumuloDiTesori(11, 16, GemsArtType.GEMS50, "3d6", null, null));
            array.add(new ItemCumuloDiTesori(17, 22, GemsArtType.GEMS100, "3d6", null, null));
            array.add(new ItemCumuloDiTesori(23, 28, GemsArtType.ART250, "2d4", null, null));
            array.add(new ItemCumuloDiTesori(29, 32, GemsArtType.ART25, "2d4", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(33, 36, GemsArtType.GEMS50, "3d6", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(37, 40, GemsArtType.GEMS100, "3d6", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(41, 44, GemsArtType.ART250, "2d4", MagickItemTableType.A, "1d6"));
            array.add(new ItemCumuloDiTesori(45, 49, GemsArtType.ART25, "2d4", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(50, 54, GemsArtType.GEMS50, "3d6", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(55, 59, GemsArtType.GEMS100, "3d6", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(60, 63, GemsArtType.ART250, "2d4", MagickItemTableType.B, "1d4"));
            array.add(new ItemCumuloDiTesori(64, 66, GemsArtType.ART25, "2d4", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(67, 69, GemsArtType.GEMS50, "3d6", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(70, 72, GemsArtType.GEMS100, "1d4", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(73, 74, GemsArtType.ART250, "2d4", MagickItemTableType.C, "1d4"));
            array.add(new ItemCumuloDiTesori(75, 76, GemsArtType.ART25, "2d4", MagickItemTableType.D, "1d1"));
            array.add(new ItemCumuloDiTesori(77, 78, GemsArtType.GEMS50, "3d6", MagickItemTableType.D, "1d1"));
            array.add(new ItemCumuloDiTesori(79, 79, GemsArtType.GEMS100, "3d6", MagickItemTableType.D, "1d1"));
            array.add(new ItemCumuloDiTesori(80, 80, GemsArtType.ART250, "2d4", MagickItemTableType.D, "1d1"));
            array.add(new ItemCumuloDiTesori(81, 84, GemsArtType.ART25, "2d4", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(85, 88, GemsArtType.GEMS50, "3d6", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(89, 91, GemsArtType.GEMS100, "3d6", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(92, 94, GemsArtType.ART250, "2d4", MagickItemTableType.F, "1d4"));
            array.add(new ItemCumuloDiTesori(95, 96, GemsArtType.GEMS100, "3d6", MagickItemTableType.G, "1d4"));
            array.add(new ItemCumuloDiTesori(97, 98, GemsArtType.ART250, "2d4", MagickItemTableType.G, "1d4"));
            array.add(new ItemCumuloDiTesori(99, 99, GemsArtType.GEMS100, "3d6", MagickItemTableType.H, "1d1"));
            array.add(new ItemCumuloDiTesori(100, 100, GemsArtType.ART250, "2d4", MagickItemTableType.H, "1d1"));
            return array;
        }
    }

    private static class CumuloTesori1116 extends CumuloTesori{

        private ItemCumuloDiTesori tesoriAggiuntivi;

        @Override
        protected void generateCoins() {
            Dice d6 = new Dice(DiceType.D6);
            int quantity = 0;

            for(int i = 0; i<4; i++)
                quantity+=d6.throwDice();
            monetaOro.setQuantita(quantity*1000);

            quantity = 0;
            for(int i = 0; i<5; i++)
                quantity+=d6.throwDice();
            monetaPlatino.setQuantita(quantity*100);

        }

        @Override
        protected ArrayList<ItemCumuloDiTesori> buildTable() {
            ArrayList<ItemCumuloDiTesori> array = new ArrayList<>(35);
            array.add(new ItemCumuloDiTesori(-1, -1, null, null, null, null));
            array.add(new ItemCumuloDiTesori( 1, 3,null, null, null, null ));
            array.add(new ItemCumuloDiTesori( 4, 6, GemsArtType.ART250, "2d4", null, null ));
            array.add(new ItemCumuloDiTesori( 7, 9, GemsArtType.ART750, "2d4", null, null  ));
            array.add(new ItemCumuloDiTesori( 10, 12, GemsArtType.GEMS500, "3d6", null, null  ));
            array.add(new ItemCumuloDiTesori( 13, 15,GemsArtType.GEMS1000, "3d6", null, null ));
            array.add(new ItemCumuloDiTesori( 16, 19, GemsArtType.ART250, "2d4", MagickItemTableType.A, "1d4" ));
            array.add(new ItemCumuloDiTesori( 20, 23, GemsArtType.ART750, "2d4", MagickItemTableType.A, "1d4" ));
            array.add(new ItemCumuloDiTesori( 24, 26, GemsArtType.GEMS500, "3d6", MagickItemTableType.A, "1d4" ));
            array.add(new ItemCumuloDiTesori( 27, 29, GemsArtType.GEMS1000, "3d6", MagickItemTableType.A, "1d4" ));
            array.add(new ItemCumuloDiTesori( 30, 35, GemsArtType.ART250, "2d4", MagickItemTableType.C, "1d6" ));
            array.add(new ItemCumuloDiTesori( 36, 40, GemsArtType.ART750, "2d4", MagickItemTableType.C, "1d6" ));
            array.add(new ItemCumuloDiTesori( 41, 45, GemsArtType.GEMS500, "3d6", MagickItemTableType.C, "1d6" ));
            array.add(new ItemCumuloDiTesori( 46, 50, GemsArtType.GEMS1000, "3d6", MagickItemTableType.C, "1d6" ));
            array.add(new ItemCumuloDiTesori( 51, 54, GemsArtType.ART250, "2d4", MagickItemTableType.D, "1d4" ));
            array.add(new ItemCumuloDiTesori( 55, 58, GemsArtType.ART750, "2d4", MagickItemTableType.D, "1d4" ));
            array.add(new ItemCumuloDiTesori( 59, 62, GemsArtType.GEMS500, "3d6", MagickItemTableType.D, "1d4" ));
            array.add(new ItemCumuloDiTesori( 63, 66, GemsArtType.GEMS1000, "3d6", MagickItemTableType.D, "1d4" ));
            array.add(new ItemCumuloDiTesori( 67, 68, GemsArtType.ART250, "2d4", MagickItemTableType.E, "1d1" ));
            array.add(new ItemCumuloDiTesori( 69, 70, GemsArtType.ART750, "2d4", MagickItemTableType.E, "1d1" ));
            array.add(new ItemCumuloDiTesori( 71, 72, GemsArtType.GEMS500, "3d6", MagickItemTableType.E, "1d1" ));
            array.add(new ItemCumuloDiTesori( 73, 74, GemsArtType.GEMS1000, "3d6", MagickItemTableType.E, "1d1" ));
            array.add(new ItemCumuloDiTesori( 75, 76, GemsArtType.ART250, "2d4", MagickItemTableType.F, "1d1" ));
            array.add(new ItemCumuloDiTesori( 77, 78, GemsArtType.ART750, "2d4", MagickItemTableType.F, "1d1"  ));
            array.add(new ItemCumuloDiTesori( 79, 80, GemsArtType.GEMS500, "3d6", MagickItemTableType.F, "1d1" ));
            array.add(new ItemCumuloDiTesori( 81, 82, GemsArtType.GEMS1000, "3d6", MagickItemTableType.F, "1d1" ));
            array.add(new ItemCumuloDiTesori( 83, 85, GemsArtType.ART250, "2d4", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 86, 88, GemsArtType.ART750, "2d4", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 89, 90, GemsArtType.GEMS500, "3d6", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 91, 92, GemsArtType.GEMS1000, "3d6", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 93, 94, GemsArtType.ART250, "2d4", MagickItemTableType.I, "1d1" ));
            array.add(new ItemCumuloDiTesori( 95, 96, GemsArtType.ART750, "2d4", MagickItemTableType.I, "1d1" ));
            array.add(new ItemCumuloDiTesori( 97, 98, GemsArtType.GEMS500, "3d6", MagickItemTableType.I, "1d1" ));
            array.add(new ItemCumuloDiTesori( 99, 99, GemsArtType.GEMS1000, "3d6", MagickItemTableType.I, "1d1"));
            array.add(new ItemCumuloDiTesori( 100, 100, GemsArtType.GEMS1000, "3d6", MagickItemTableType.I, "1d1" ));

            return array;
        }

        @Override
        protected ItemCumuloDiTesori getItems(int result) {
            ItemCumuloDiTesori itemCumuloDiTesori = super.getItems(result);
            if(itemCumuloDiTesori.getMin()>=16 && itemCumuloDiTesori.getMax()<=29)
                tesoriAggiuntivi = new ItemCumuloDiTesori(16,29,null,null,MagickItemTableType.B, "1d6");
            else if(itemCumuloDiTesori.getMin()>=75 && itemCumuloDiTesori.getMax()<=82)
                tesoriAggiuntivi = new ItemCumuloDiTesori(75, 82, null, null, MagickItemTableType.G, "1d4");
            else tesoriAggiuntivi = null;
            return itemCumuloDiTesori;
        }

        @Override
        public Loot extractLoot(int result){
            Loot loot = super.extractLoot(result);
            if(tesoriAggiuntivi != null) //if ci sono tesori aggiuntivi
                loot.addMagickItems(tesoriAggiuntivi.generateItems().getMagickItems());
            return loot;
        }



    }

    private static class CumuloTesori17 extends CumuloTesori{

        @Override
        protected void generateCoins() {
            Dice d6 = new Dice(DiceType.D6);
            int quantity = 0;

            for(int i = 0; i<12; i++)
                quantity+=d6.throwDice();
            monetaOro.setQuantita(quantity*1000);

            quantity = 0;
            for(int i = 0; i<8; i++)
                quantity+=d6.throwDice();
            monetaPlatino.setQuantita(quantity*1000);
        }

        @Override
        protected ArrayList<ItemCumuloDiTesori> buildTable() {
            ArrayList<ItemCumuloDiTesori> array = new ArrayList<>(27);
            array.add(new ItemCumuloDiTesori(-1, -1, null, null, null, null));
            array.add(new ItemCumuloDiTesori( 1 , 2,null, null, null, null ));
            array.add(new ItemCumuloDiTesori( 3, 5, GemsArtType.GEMS1000, "3d6", MagickItemTableType.C, "1d8" ));
            array.add(new ItemCumuloDiTesori( 6, 8, GemsArtType.ART2500, "1d10", MagickItemTableType.C, "1d8" ));
            array.add(new ItemCumuloDiTesori( 9, 11, GemsArtType.ART7500, "1d4", MagickItemTableType.C, "1d8" ));
            array.add(new ItemCumuloDiTesori( 12, 14, GemsArtType.GEMS5000, "1d8", MagickItemTableType.C, "1d8" ));
            array.add(new ItemCumuloDiTesori( 15, 22, GemsArtType.GEMS1000, "3d6", MagickItemTableType.D, "1d6" ));
            array.add(new ItemCumuloDiTesori( 23, 30, GemsArtType.ART2500, "1d10", MagickItemTableType.D, "1d6" ));
            array.add(new ItemCumuloDiTesori( 31, 38, GemsArtType.ART7500, "1d4", MagickItemTableType.D, "1d6" ));
            array.add(new ItemCumuloDiTesori( 39, 46, GemsArtType.GEMS5000, "1d8", MagickItemTableType.D, "1d6" ));
            array.add(new ItemCumuloDiTesori( 47, 52, GemsArtType.GEMS1000, "3d6", MagickItemTableType.E, "1d6" ));
            array.add(new ItemCumuloDiTesori( 53, 58, GemsArtType.ART2500, "1d10", MagickItemTableType.E, "1d6" ));
            array.add(new ItemCumuloDiTesori( 59, 63, GemsArtType.ART7500, "1d4", MagickItemTableType.E, "1d6" ));
            array.add(new ItemCumuloDiTesori( 64, 68, GemsArtType.GEMS5000, "1d8", MagickItemTableType.E, "1d6" ));
            array.add(new ItemCumuloDiTesori( 69 , 69, GemsArtType.GEMS1000, "3d6", MagickItemTableType.G, "1d4" ));
            array.add(new ItemCumuloDiTesori( 70 , 70, GemsArtType.ART2500, "1d10", MagickItemTableType.G, "1d4" ));
            array.add(new ItemCumuloDiTesori( 71 , 71, GemsArtType.ART7500, "1d4", MagickItemTableType.G, "1d4" ));
            array.add(new ItemCumuloDiTesori( 72, 72, GemsArtType.GEMS5000, "1d8", MagickItemTableType.G, "1d4" ));
            array.add(new ItemCumuloDiTesori( 73, 74, GemsArtType.GEMS1000, "3d6", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 75, 76, GemsArtType.ART2500, "1d10", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 77, 78, GemsArtType.ART7500, "1d4", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 79, 80, GemsArtType.GEMS5000, "1d8", MagickItemTableType.H, "1d4" ));
            array.add(new ItemCumuloDiTesori( 81,  85, GemsArtType.GEMS1000, "3d6", MagickItemTableType.I, "1d4" ));
            array.add(new ItemCumuloDiTesori( 86, 90, GemsArtType.ART2500, "1d10", MagickItemTableType.I, "1d4" ));
            array.add(new ItemCumuloDiTesori( 91 , 95, GemsArtType.ART7500, "1d4", MagickItemTableType.I, "1d4" ));
            array.add(new ItemCumuloDiTesori( 96, 99, GemsArtType.GEMS5000, "1d8", MagickItemTableType.I, "1d4"));
            array.add(new ItemCumuloDiTesori( 100, 100, GemsArtType.GEMS5000, "1d8", MagickItemTableType.I, "1d4" ));
            return array;
        }
    }

}
