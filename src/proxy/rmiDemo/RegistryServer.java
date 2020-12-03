package proxy.rmiDemo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.concurrent.CountDownLatch;

public class RegistryServer{
    public static void main(String[] args) throws InterruptedException {
        try {
            //Registry使用8000端口
            LocateRegistry.createRegistry(8000);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        //countDownLatch这个类使一个线程等待其他线程各自执行完毕后再执行。
        //是通过一个计数器来实现的，计数器的初始值是线程的数量。
        // 每当一个线程执行完毕后，计数器的值就-1，
        // 当计数器的值为0时，表示所有线程都执行完毕，然后在闭锁上等待的线程就可以恢复工作了。
        CountDownLatch latch = new CountDownLatch(1);
        //挂起主线程，否则应用会退出
        latch.await();
    }

}