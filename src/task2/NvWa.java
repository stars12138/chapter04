package task2;

public class NvWa {
    public static void main(String[] args){
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        //黄色人种创建
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman= femaleHumanFactory.createYellowHuman();
        System.out.println("创建黄色女性");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("创建黄色男性");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

        //黑色人种创建
        Human maleBlackHuman=maleHumanFactory.createBlackHuman();
        Human femaleBlackHuman=femaleHumanFactory.createBlackHuman();
        System.out.println("创建黑色女性");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
        System.out.println("创建黑色男性");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();

        //白色人种创建
        Human maleWhiteHuman=maleHumanFactory.createWhiteHuman();
        Human femaleWhiteHuman=femaleHumanFactory.createWhiteHuman();
        System.out.println("创建白色女性");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getColor();
        System.out.println("创建白色男性");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();
    }
}
