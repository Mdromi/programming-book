package ecom;

public class Dimension {
    private final int height;
    private final int width;
    private final int length;

    public Dimension(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getVolume() {
        return this.height * length * weight;
    }
}