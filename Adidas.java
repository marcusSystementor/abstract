public class Adidas extends Sweater {

    public Adidas(String color, int cost) {
        super(color, cost);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void putOn() {
      
        System.out.println("I put on Adidas with color " + color);

    }

    @Override
    public void takeOff() {
    
        System.out.println("I take off the Adidas with color " + color);

    }

    public void buyAdidas() {
        System.out.println("I buy one sweater, Adidas. Total cost " + cost);
    }
    

}
