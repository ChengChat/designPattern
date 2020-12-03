package factory.builder;

/**
 * 建造者模式：
 * 封装一个产品的构造过程，并允许按步骤钩造。
 *
 * 放在这个包下，只是与抽象工厂做对比。
 */
public class Main {
    public static void main(String[] args) {
        // 非 Builder 模式
        Computer computer = new Computer("i7 8700", "Dell S2719HS", "PM981", "华硕 B365M");
        // Builder 模式
        //上面的示例代码只是传入四个参数，如果参数是十四个甚至更多，
        // builder 模式的优势将会更加明显，传递参数更加灵活，代码具有更高的可读性.
        NewComputer build = new NewComputer.Builder()
                .cpu("i7 8700")
                .screen("Dell S2719HS")
                .memory("PM981")
                .mainBoard("华硕 B365M")
                .build();
    }
}
