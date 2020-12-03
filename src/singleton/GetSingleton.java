package singleton;

/**
 * 用这个类来模拟多线程执行单例
 */
public class GetSingleton implements Runnable {

    @Override
    public void run() {
        System.out.println(Singleton.instance());
    }
}
