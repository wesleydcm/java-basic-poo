package Animals;

public class Dog {

    static int numberOfDogs;
    private String name;
    private String color;
    private int height;
    private double lengthTail;
    private String humor;

    // Constructor

    public Dog(String name, String color, int height, double lengthTail, String humor) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.lengthTail = lengthTail;
        this.humor = humor;

        numberOfDogs++;
    }


    // Methods
    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

    public static void setNumberOfDogs(int numberOfDogs) {
        Dog.numberOfDogs = numberOfDogs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLengthTail() {
        return lengthTail;
    }

    public void setLengthTail(double lengthTail) {
        this.lengthTail = lengthTail;
    }



    public String getHumor() {
        return humor;
    }

    public void bark(){
        System.out.println("AU AU AU AU AU AU AU AU AU AU");
    }

    public String toTake() {
        return "ball";
    }


    public String interact(String action) {

        switch (action) {

            case "kindness":
                this.humor = "happy";
                break;


            case "go sleep":
                this.humor = "angry";
                break;


            case "step on paw":
                this.humor = "sad";
                break;


            default:
                this.humor = "neutral";



        }

        return this.humor;

    }

}
