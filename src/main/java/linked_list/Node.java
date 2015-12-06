package linked_list;

/**
 * Created by lstefa on 03/12/15.
 */
public class Node {

    private int value;
    private Node nextNode;

    public Node(int v){
        this.value = v;
        this.nextNode = null;
    }

    public int getValue(){
        return value;
    }

    public Node getNext(){
        return nextNode;
    }

    public void setValue(int newVal){
        this.value = newVal;
    }

    public void setNextNode(Node newNode){
        this.nextNode = newNode;
    }


    @Override
    public String toString(){
        return ""+value;
    }
}
