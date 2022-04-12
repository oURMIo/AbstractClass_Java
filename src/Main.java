public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Shakal shakal = new Shakal();
        Giena giena = new Giena();

        dog.type();
        dog.danger();
//        dog.feed();
        feed(dog);

        wolf.type();
        wolf.danger();
//        wolf.feed();
        feed(wolf);

        shakal.type();
        shakal.danger();
//        shakal.feed();
        feed(shakal);

        giena.type();
        giena.danger();
//        giena.feed();
        feed(giena);
    }

    private static void feed(Animal noname) {
        System.out.printf(" feed it %n %n");
    }
}
