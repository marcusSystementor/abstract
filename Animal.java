public abstract class Animal {


    protected String type;
    protected String colorOnAnimal;
    protected double age;

    public Animal(String type, String colorOnAnimal, double age) {

        this.type = type;
        this.colorOnAnimal = colorOnAnimal;
        this.age = age;
    }

    public abstract void run();

    public abstract void eat();

    public abstract void sleep();
    
}
