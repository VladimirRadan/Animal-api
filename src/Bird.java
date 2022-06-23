public class Bird extends Animal implements Flyable{

    int wingsLength;

    public Bird(String animalSpecies, int age, String gender, double weight, int wingsLength) {
        super(animalSpecies, age, gender, weight);
        this.wingsLength = wingsLength;
    }




    @Override
    public String toString() {
        return super.toString() + " wings length " + wingsLength;
    }

    @Override
    protected void move() {
        System.out.println("Flapping wings...");
    }


    @Override
    public void fly() {
        System.out.println("Flying around....nad klasa");
    }


}
