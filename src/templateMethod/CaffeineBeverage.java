package templateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        //把水煮沸
        boilWater();
        //冲泡
        brew();
        //把饮料倒进杯子
        pourInCup();
        //加调料
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    private void boilWater(){
        System.out.println("Boiling water");
    }

    abstract void brew();

    private void pourInCup(){
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    boolean customerWantsCondiments(){
        return true;
    }


}
