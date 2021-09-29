package task2;

public class FemaleBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人黑颜色");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话");
    }

    @Override
    public void getSex() {
        System.out.println("黑种人女性");
    }
}
