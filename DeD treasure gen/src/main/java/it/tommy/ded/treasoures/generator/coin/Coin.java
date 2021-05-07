package it.tommy.ded.treasoures.generator.coin;

public abstract class Coin {
    protected int quantita;

    public Coin(int quantita){
        this.quantita = quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public static class MonetaRame extends Coin{
        public MonetaRame(int quantita) {
            super(quantita);
        }
    }

    public static class MonetaArgento extends Coin{
        public MonetaArgento(int quantita) {
            super(quantita);
        }
    }

    public static class MonetaEtereum extends Coin{
        public MonetaEtereum(int quantita) {
            super(quantita);
        }
    }

    public static class MonetaOro extends Coin{
        public MonetaOro(int quantita) {
            super(quantita);
        }
    }

    public static class MonetaPlatino extends Coin{
        public MonetaPlatino(int quantita) {
            super(quantita);
        }
    }
}
