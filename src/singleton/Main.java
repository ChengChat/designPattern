package singleton;

/**
 * 单例模式：
 * 确保一个类只有一个实例，并提供应该全局访问点。
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Singleton instance = Singleton.instance();
        Singleton instance1 = Singleton.instance();
        System.out.println(instance == instance1);
    //        testMultiThread();
    }

    /**
     * 测试多线程情况下能否实现单例：
     * 测试表明，如果不加同步，很大情况下不能达到单例效果
     */
    public static void testMultiThread() {
        GetSingleton getSingleton = new GetSingleton();
        Thread thread = new Thread(getSingleton);
        Thread thread2 = new Thread(getSingleton);
        thread.start();
        thread2.start();
    }
}
