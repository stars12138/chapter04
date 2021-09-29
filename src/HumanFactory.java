public class HumanFactory extends AbstractHumanFactory{
    @SuppressWarnings("unchecked")
    public <T extends Human> T createHuman(Class<T> C) {
        Human human=null;
        try {
            human=(Human) Class.forName(C.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
