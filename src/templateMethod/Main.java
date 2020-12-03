package templateMethod;

/**
 * 模板方法模式：
 * 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤。
 * <p>
 * 什么是模板？
 * 模板就是一个方法。这个方法将算法定义成一组步骤，其中的任何步骤都可以是抽象的，由子类负责实现。
 * 这可以确保算法的结构保持不变，同时由子类提供部分实现。
 * <p>
 * 钩子函数：hook
 * 我们也可以有“默认不做事的方法”，我们称这种方法为“hook”（钩子）。子类可以视情况决定要不要覆盖它们。
 * 钩子的几种用法：
 * 1. 钩子可以让子类实现算法中可选的部分，或者在钩子对与子类的实现并不重要时，子类可以对此钩子置之不理。
 *  * 2. 让子类能够有机会对模板方法中某些即将发生的（或刚刚发生的）步骤做出反应。
 *  * 3. 钩子也可以让子类有能力为其抽象类做一些决定。
 *
 * 设计原则：好莱坞原则：
 * 别调用（打电话给）我们，我们会调用（打电话给）你。
 * 换句话说，高层组件对待底层组件的方式是“别调用我们，我们会调用你”。
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println();

        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
