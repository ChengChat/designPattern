package singleton;

public class Singleton implements Cloneable {
    private static Singleton singleton;

    private Singleton(){
    }

    public /*synchronized*/ static Singleton instance(){
        if(singleton == null){
            // 使用双重检查加锁
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
