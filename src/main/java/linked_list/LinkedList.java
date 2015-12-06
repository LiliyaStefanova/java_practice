package linked_list;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;

/**
 * Created by lstefa on 03/12/15.
 */
public class LinkedList {

    private Node head;

    public LinkedList(){
      //  lnkListStruct = new ArrayList<Node>();
        this.head = null;
    }

    public void add(Node item){
        if(head == null){
            head = item;
        }
        else{
            Node current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNextNode(item);
        }
    }

    public Node remove(Node item){
            Node result = null;
            if(item.equals(head)){
                head = head.getNext();
             }
            else{
                Node current = head;
                while(current.getNext().getNext()!=null){
                    current = current.getNext();
                }
                result = current.getNext();
                current.setNextNode(null);
            }
        return result;
    }

    public void reverseList(){
        Node current = head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
        Node endOfRegList = current;
        Node endOfRevList = current;
        current = head;
        Node prev = null;
        while(!current.equals(endOfRegList)){
            if(current.getNext().getNext().equals(endOfRegList)){
                prev = current;
                Node temp = current.getNext();
                prev.setNextNode(endOfRegList);
                endOfRevList.setNextNode(temp);
                endOfRevList = endOfRevList.getNext();

            }
            else{
                current = current.getNext();
            }

        }

    }

    public void printList(Node head){
        Node current = head;
        while(current!=null){
            System.out.println(current.toString());
            current = current.getNext();
        }
    }

    public static void main(String [] args){

        LinkedList tl = new LinkedList();
        Node node1 = new Node(3);
        Node node2 = new Node(6);
        Node node3 = new Node(9);
        Node node4 = new Node(12);
        tl.add(node1);
        tl.add(node2);
        tl.add(node3);
        tl.add(node4);
        tl.printList(tl.head);
        tl.reverseList();
        tl.printList(tl.head);
    }
}
