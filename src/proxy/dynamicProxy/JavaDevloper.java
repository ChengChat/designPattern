package proxy.dynamicProxy;

public class JavaDevloper implements Developer {
    private String name;

    public JavaDevloper(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " is coding java");
    }

    @Override
    public void debug() {
        System.out.println(name + " is debugging java");
    }

    @Override
    public void test() {
        System.out.println(name + "is testing java");
    }
}
