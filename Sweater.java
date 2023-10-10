// abstrakt klass, en mall för Sweater

public abstract class Sweater {

    protected String color;
    protected int cost;

    public Sweater(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }


    public abstract void putOn();

    public abstract void takeOff();

}