package task2;

public class MaleYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人黄颜色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }

    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }
}
