import java.util.Arrays;

public class Animal {

    protected String animalSpecies;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(String animalSpecies, int age, String gender, double weight) {
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "animalSpecies='" + animalSpecies + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }


    public static void zivotinje(Animal[] animals){
        System.out.println((Arrays.toString(animals)));
    }



}
