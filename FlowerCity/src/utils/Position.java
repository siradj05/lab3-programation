package utils;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }




    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Object getName() {
        return null;
    }
}
