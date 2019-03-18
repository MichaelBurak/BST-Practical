package com.company.BSTPractical;

public class BST {
    //type Node
    // BST is meant to be called in main as BST tree = new BST(); tree.insert(10,"Ten")
    private Node root;

    // insert min max and remove methods

    //returns nothing = type void
    public void insert(int key, String value){

        Node newNode = new Node(key, value);
        //make sure root is not null --> if so create tree with root node
        if(root == null){
            root = newNode;
        }
        else{

            //traversing vars
            Node current = root;
            Node parent;

            while (true){
                //start with parent as current node
                parent = current;
                //less than key, insert to left
                if(key < current.key){
                    current = current.leftChild;
                    // move towards left until null
                    if(current == null){
                        //parent would be leaf node
                        parent.leftChild = newNode;
                        //break out of statement
                        return;
                    } else { //still inside loop, right case
                        current = current.rightChild;
                        if(current == null){
                            parent.rightChild = newNode;
                        }
                    }
                }
            }
        }

    }

    public Node findMin(){
        //start from top with traversal var
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.leftChild; //advancing to left(looking for smaller)
        }
        return last;
    }


    public Node findMax(){
        //start from top with traversal var
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            current = current.rightChild; //advancing to right(looking for greater)
        }
        return last;
    }
}
