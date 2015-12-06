package queue;

/**
 * Created by lstefa on 02/12/15.
 */
public class Queue<P> {

    private Stack<P> main_stack;
    private Stack<P> aux_stack;

    public Queue(){
        main_stack = new Stack<P>();
        aux_stack = new Stack<P>();
    }

    public void enqueue(P item){
        if(!main_stack.isEmpty()){
            int sz_mn_stk_before_pop = main_stack.stack_size();
            for(int i=0; i<sz_mn_stk_before_pop; i++){
                P into_aux = main_stack.pop();
                aux_stack.push(into_aux);

            }
            int sz_aux_stk_before_pop = aux_stack.stack_size();
            main_stack.push(item);
            for(int j=0; j<sz_aux_stk_before_pop; j++){
                P into_main = aux_stack.pop();
                main_stack.push(into_main);
            }
        }
        else{
            main_stack.push(item);
        }
    }

    public P dequeue(){
        if(main_stack.isEmpty()){
            System.out.println("Sorry stack is empty");
        }
        return main_stack.pop();
    }

    public void printContents(){
        System.out.println("queue.Queue contents in FIFO order: ");
        main_stack.print_contents();
        System.out.println();
    }

    public static void main(String [] args){
        Queue<Integer> test_queue = new Queue<Integer>();
        Queue<String> string_queue = new Queue<String>();
        test_queue.enqueue(1);
//        test_queue.printContents();
        test_queue.enqueue(5);
//        test_queue.printContents();
        test_queue.enqueue(4);
//        test_queue.printContents();
        test_queue.enqueue(12);
        test_queue.printContents();
        test_queue.enqueue(56);
        test_queue.printContents();
        test_queue.dequeue();
        test_queue.printContents();
        test_queue.dequeue();
        test_queue.printContents();
        string_queue.enqueue("I");
        string_queue.enqueue("B");
        string_queue.enqueue("D");
        string_queue.enqueue("W");
    }
}
