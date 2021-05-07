package it.tommy.ded.treasoures.generator.dice;

public enum DiceType {
    D1(1),
    D2(2),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final int max;
    private final int min = 1;

    DiceType(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
