package ques2main;
import ques2service.Ascending;
import static ques2service.Ascending.*;

public class Main {

    public static void main(String[] arg)
    {
        Ascending tree = new Ascending();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);
        int order=0;
        Ascending.skewed(node, order);
        Ascending.right(headNode);
    }
}


