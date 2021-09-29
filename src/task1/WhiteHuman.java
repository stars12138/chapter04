package task1;

public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
