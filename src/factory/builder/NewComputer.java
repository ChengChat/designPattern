package factory.builder;

public class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public NewComputer() {
        throw new RuntimeException("can’t init");
    }

    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainBoard = builder.mainBoard;
    }

    static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        Builder() {
        }

        Builder cpu(String val) {
            cpu = val;
            return this;
        }

        Builder screen(String val) {
            screen = val;
            return this;
        }

        Builder memory(String val) {
            memory = val;
            return this;
        }

        Builder mainBoard(String val) {
            mainBoard = val;
            return this;
        }

        NewComputer build() {
            return new NewComputer(this);
        }
    }
} 