public class Zoo {

    public static void moveAnimals(Animal[] animal){
        for (int i = 0; i < animal.length; i++) {
                animal[i].move();
        }
    }

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

        Dog dog = new Dog("Doberman", 2, "M", 10);
        //dog.eat("aww");

        //Animal [] animals = {bird, tiger, fish, dog}; //polymorphic array

        //Animal.zivotinje(animals);

        Flyable flyable = new Hawk("Hawk", 2, "M", 10, 2);
        flyable.fly();

       // moveAnimals(animals);

        




    }//end main method




}
