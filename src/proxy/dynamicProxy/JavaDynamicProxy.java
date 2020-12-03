package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class JavaDynamicProxy{
    public static void main(String[] args) {
        JavaDevloper zhangsan = new JavaDevloper("zhangsan");
        //现在已经在程序运行中了，而下面这个类是在运行时动态创建的一个代理类。
        Developer zhangsanProxy = (Developer) Proxy.newProxyInstance(zhangsan.getClass().getClassLoader(),
                zhangsan.getClass().getInterfaces(), (proxy, method, args1) -> {
                    if (method.getName().equals("code")) {
                        System.out.println("zhangshan is praying for the code");
                        return method.invoke(zhangsan, args1);
                    }
                    if (method.getName().equals("debug")) {
                        System.out.println("zhangsan's have no bug, no need to debug!");
                        return null;
                    }
                    return method.invoke(zhangsan,args1);
                });
        zhangsanProxy.code();
        zhangsanProxy.debug();
        zhangsanProxy.test();
    }
}