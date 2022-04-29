/*
 * Main class
 *
 */

public class Main {
    public static void main(String[] args) {
        //OBJECT
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Shakal shakal = new Shakal();
        Giena giena = new Giena();

        dog.nameDanger();
        feed(dog);

        wolf.nameDanger();
        feed(wolf);

        shakal.nameDanger();
        feed(shakal);

        giena.nameDanger();
        feed(giena);

        Animal animal1 = getAnimal1();
        Animal animal2 = getAnimal1();
        Animal animal3 = getAnimal1();
        Animal animal4 = getAnimal1();

        animal1.nameDanger();
        animal2.nameDanger();
        animal3.nameDanger();
        animal4.nameDanger();
    }

    //METOD FOR FEED
    private static void feed(Animal pers) {
        System.out.printf(" feed - %s %n %n", pers.name);
    }

    private static Animal getAnimal1() {
        return new Dog();
    }

    private static Animal getAnimal2() {
        return new Giena();
    }

    private static Animal getAnimal3() {
        return new Shakal();
    }

    private static Animal getAnimal4() {
        return new Wolf();
    }
}