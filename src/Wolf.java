public class Wolf extends Animals{
    @Override
    public void type() {
        System.out.printf("/// WOLF - ");
    }
    @Override
    public void danger() {
        System.out.println("i'm dangerous, so drop meat");
    }
}
