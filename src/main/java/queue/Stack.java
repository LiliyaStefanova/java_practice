package queue;

import java.util.ArrayList;

/**
 * Created by lstefa on 02/12/15.
 */
public class Stack<T> {

    private ArrayList<T> stack_struct;

    public Stack(){
        stack_struct = new ArrayList<T>();
    }

    public void push(T item){
        stack_struct.add(item);
    }
    public  T pop(){
        T result = stack_struct.get(stack_struct.size()-1);
        stack_struct.remove(stack_struct.size()-1);
        return result;
    }

    public boolean isEmpty() {
        return stack_struct.size() == 0;
    }

    public int stack_size(){
        return stack_struct.size();
    }

    public void print_contents(){
        System.out.print("back: ");
        for(T item: stack_struct){
            System.out.print(item + ",");
        }
        System.out.print(" :front");
    }
}
