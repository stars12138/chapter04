public class NvWa {
    public static void main(String[] args){
            AbstractHumanFactory Y=new HumanFactory();
            Human whiteHuman=Y.createHuman(WhiteHuman.class);
            whiteHuman.getColor();
            whiteHuman.talk();
            Human blackHuman=Y.createHuman(BlackHuman.class);
            blackHuman.getColor();
            blackHuman.talk();
            Human yellowHuman=Y.createHuman(YellowHuman.class);
            yellowHuman.getColor();
            yellowHuman.talk();
    }
}
