public class Bird extends Animal{

    int wingsLength;

    public Bird(String animalSpecies, int age, String gender, double weight, int wingsLength) {
        super(animalSpecies, age, gender, weight);
        this.wingsLength = wingsLength;
    }



    public void fly(){
        System.out.println("Flying.....");
    }


    @Override
    public String toString() {
        return super.toString() + " wings length " + wingsLength;
    }


}
