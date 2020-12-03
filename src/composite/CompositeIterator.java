package composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * 用堆栈实现了树的遍历
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<>();
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else {
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }else{
            return null;
        }
    }
}
