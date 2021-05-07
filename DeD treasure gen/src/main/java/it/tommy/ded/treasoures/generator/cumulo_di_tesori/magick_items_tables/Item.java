package it.tommy.ded.treasoures.generator.cumulo_di_tesori.magick_items_tables;

public class Item implements Comparable<Item>{
    private int min;
    private int max;
    private String descrizione;

    public Item(int min, int max, String descrizione) {
        this.min = min;
        this.max = max;
        this.descrizione = descrizione;
    }


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Override
    public int compareTo(Item item) {
        if(min< item.min) return -1;
        else if(min> item.min) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return getDescrizione();
    }
}
