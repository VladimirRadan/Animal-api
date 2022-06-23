public class Fish extends Animal{


    public Fish(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    protected void move() {
        System.out.println("Waiwing tail....");
    }

    public void swim(){
        System.out.println("Swimming....");
    }



}
