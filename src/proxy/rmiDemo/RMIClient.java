package proxy.rmiDemo;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            //获取注册中心引用
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8000);
            //获取RemoteHello服务
            MyRemote remote = (MyRemote) registry.lookup("hello");
            //调用远程方法
            System.out.println(remote.sayHello());
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}