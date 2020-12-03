package proxy;

import java.rmi.server.UnicastRemoteObject;

/**
 * 代理模式：
 * 为另一个对象提供一个替身或者占位符以控制对这个对象的访问。
 *
 * 使用代理模式创建代表（representative）对象，让代表对象控制某个对象的访问，
 * 被代理的对象可以是远程的对象、创建开销大的对象或需要安全控制的对象。
 *
 * 代理控制访问的方式：
 * 1. 远程代理控制访问远程对象。RMI
 *      生成远程对象的本地代表
 * 2. 虚拟代理控制访问创建开销大的资源。
 * 3. 保护代理基于权限控制对资源的访问。
 *
 */
public class Main {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("GumballMachine <name> <inventory>");
        //system.exit（0）:正常退出，程序正常执行结束退出
        //system.exit(1):是非正常退出，就是说无论程序正在执行与否，都退出，
        if(args.length == 0){
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
