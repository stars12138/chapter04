package task1;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
