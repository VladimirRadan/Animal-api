public class Zoo {

    public static void main(String[] args) {

        Bird bird = new Bird("Eagle", 10, "M", 5, 3);
//        bird.fly();
//        System.out.println(bird);

        Tiger tiger = new Tiger("Bengal", 10, "F", 50);
//        tiger.ispis();
//        System.out.println(tiger);

        Fish fish = new Fish("Smudj", 2, "M", 2);
//        fish.swim();
//        System.out.println(fish);

        Animal [] animals = {bird, tiger, fish};


        Animal.zivotinje(animals);

    }


}
