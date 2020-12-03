package proxy.rmiDemo;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl implements MyRemote {

    @Override
    public String sayHello() throws RemoteException {
        return "Server says , Hey!";
    }
}
