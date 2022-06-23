public class Cat extends Animal{



    public Cat(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    protected void move() {
        System.out.println("Jumping around....");
    }


    public void ispis(){
        System.out.println("Mjauuuuuuu");
    }



}
