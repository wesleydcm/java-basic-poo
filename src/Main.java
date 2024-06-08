import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println(Dog.getNumberOfDogs());

        // Objeto
        Dog pipa = new Dog("Pipa", "Black and Brown", 10,.5, "Neutral");
        System.out.println(Dog.getNumberOfDogs());


        Dog iguibi = new Dog("Iguibi-BigBig", "Golden", 30,1.0, "Neutral");
        System.out.println(Dog.getNumberOfDogs());

        System.out.println(pipa.toString());
        System.out.println(iguibi.toString());



//        pipa.bark();
//
//        String item = pipa.toTake();
//
//        System.out.println(item);
//
//        pipa.interact("kindness");
//        System.out.println(pipa.getHumor());
//
//        pipa.interact("go sleep");
//        System.out.println(pipa.getHumor());
//
//        pipa.interact("step on paw");
//        System.out.println(pipa.getHumor());
//
//        pipa.interact("");
//        System.out.println(pipa.getHumor());

    }
}
