package task2;

public class MaleWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人白颜色");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }

    @Override
    public void getSex() {
        System.out.println("白种人女性");
    }
}
