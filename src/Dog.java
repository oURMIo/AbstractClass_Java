public class Dog extends Animal {
    @Override
    public void type() {
        System.out.printf("/// DOG - ");
    }
    @Override
    public void danger() {
        System.out.println("i'm not dangerous, so put meat in plate");
    }
}
