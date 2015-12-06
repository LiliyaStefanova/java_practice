package prefix_tree;

import java.util.ArrayList;

/**
 * Created by lstefa on 06/12/15.
 */
public class Trie {

    /**
     * The delimeter used in this word to tell where the words end. Without a proper delimeter either A. a lookup for
     * "win" would return false if the list also contained "windows" or B. a look up for "mag" will return true if
     * the only word in the list was magnolia
     * <p>
     * the delimeter should not  occur in a word added to the trie
     */

    private Node root;
    private int size;
    private int maxDepth;

    public final static char DELIMETER = '\u0001';

    /**
     * Represents a node in the trie. Because a node's children are stored in a linked list, this data structure
     * takes the odd structure of node with a firstChild and nextSibling
     */
    private class Node {

        public int value;
        public Node firstChild;
        public Node nextSibling;

        public Node(int value) {
            this.value = value;
            firstChild = null;
            nextSibling = null;
        }
    }

    public Trie() {
        root = new Node('r');
        size = 0;
    }

    public boolean add(String word){
        if(add(root, word + DELIMETER, 0)){
            size++;
            int n= word.length();
            if(n > maxDepth) maxDepth=n;
            return true;
        }
        return false;
    }

    /**
     * Helper method to add a word to the trie
     * @param root
     * @param word
     * @param offset
     * @return
     */
    private boolean add(Node root, String word, int offset){
        if(offset==word.length()) return false;
        int c = word.charAt(offset);

        //Search for the node to add the word to
        Node last = null, next = root.firstChild;
        while(next!=null){
            //No match found, keep traversing the trie
            if(next.value<c){
                last = next;
                next = next.nextSibling;
            }
            //match found - add remaining word to this node
            else if(next.value == c){
                return add(next, word, offset+1);
            }
            else{
                break;
            }
        }
        //No match found for this char, create a new node and insert
        Node node = new Node(c);
        if(last == null){
            //Insert node at the beginning of the list - works for next == null;
            root.firstChild = node;
            node.nextSibling = next;
        }
        else{
            //inserting between last and next
            last.nextSibling = node;
            node.nextSibling = next;
        }

        //Add remaining letters
        for(int i = offset+1; i<word.length();i++){
            node.firstChild = new Node(word.charAt(i));
            node = node.firstChild;
        }
        return true;

    }

    /**
     * Searches for a word in the list
     * @param word
     * @return true if it was found
     */
    public boolean isEntry(String word) {
        if (word.length() == 0) {
            throw new IllegalArgumentException("Words can't be empty");
        }
        return isEntry(root, word + DELIMETER, 0);
    }

    private boolean isEntry(Node root, String word, int offset){
        if(offset == word.length()) return true;
        int c= word.charAt(offset);

        Node next = root.firstChild;
        while(next!=null){
            if(next.value<c) next = next.nextSibling;
            else if(next.value == c) return isEntry(next, word, offset+1);
            else return false;
        }
        return false;
    }

    public int size(){
        return size;
    }

    /**
     * Retursn all word in this list starting with the given prefix
     * @param prefix
     * @return
     */
    public String[] suggest(String prefix){
       // return suggest(root, prefix, 0);
        return null;
    }

    /**
     * Recursive function for finding all words starting with a given prefix
     * @param root
     * @param word
     * @param offset
     * @return
     */
}
