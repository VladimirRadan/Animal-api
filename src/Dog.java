public class Dog extends Animal{


    public Dog(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }


    @Override
    protected void move() {
        System.out.println("Moving and barking around....");
    }

    public void eat(){
        System.out.println("Eating bones....");
    }

    public void eat(String s){
        System.out.println("Eating bones.... " + s);
    }

    public void eat(String s, int a){
        System.out.println("Eating bones.... " + s + a);
    }








}
