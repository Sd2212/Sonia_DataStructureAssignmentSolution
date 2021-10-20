package ques2service;

public class Ascending {

    public static class Node
    {
        public  Node right;
        int val;
        public  Node left;


        public Node(int item)
        {
            val=item;
            left=right=null;
        }
    }

    public static Node node;
    static Node prevNode = null;
    public  static Node headNode = null;

    public   static void skewed(Node root,int order)
    {
        if (root==null)
        {
            return;
        }
        if (order>0)
        {
            skewed(root.right,order);
        }
        else
        {
            skewed(root.left,order);
        }
        Node rightNode=root.right;
        Node leftNode= root.left;
        if (headNode==null)
        {
            headNode=root;
            root.left=null;
            prevNode=root;
        }
        else
        {
            prevNode.right=root;
            root.left=null;
            prevNode=root;
        }
        if (order>0)
        {
            skewed(leftNode,order);
        }
        else
        {
            skewed(rightNode,order);
        }
    }

    public static  void right(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.val+" ");
        right(root.right);
    }
}


