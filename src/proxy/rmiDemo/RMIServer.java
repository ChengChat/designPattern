package proxy.rmiDemo;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public static void main(String[] args) {

        MyRemote remote = new MyRemoteImpl();
        try {
            //导出服务，使用4000端口
            MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(remote, 4000);
            //获取Registry
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8000);
            //使用名字hello，将服务注册到Registry
            registry.bind("hello", stub);
        } catch (AlreadyBoundException | IOException e) {
            e.printStackTrace();
        }

    }
}