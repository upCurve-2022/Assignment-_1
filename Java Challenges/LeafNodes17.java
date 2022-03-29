/*  17. Write a java program to print all the leaf nodes of the binary tree  */
public class LeafNodes17 {
    //creating a class named node
    static class Node{
        public int data;
        public Node left,right;
    }
    //method to print leaf nodes of binary tree
    public void printLeafNodes(Node root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            System.out.println((char)root.data+" ");
            return;
        }
        //recursively calling the method
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    static Node newNode(int data)
    {
        Node temp=new Node();
        temp.data =data;
        temp.left=null;
        temp.right=null;
        return temp;
    }

    public static void main(String[] args) {

        //Adding nodes to binary tree
        Node root=newNode('A');
        root.left=newNode('B');
        root.right=newNode('F');
        root.left.left=newNode('C');
        root.left.right=newNode('E');
        root.left.left.left=newNode('D');
        root.right.left=newNode('G');
        root.right.right=newNode('H');
        root.right.right.right=newNode('K');

        //creating object an calling the method
        LeafNodes17 obj=new LeafNodes17();
        obj.printLeafNodes(root);
    }
}
