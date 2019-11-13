//Spiral of Binary Tree
import java.util.*; 
public class SpiralTree 
{ 
    static class Node
{ 
    int data; 
    Node left, right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
};
    Node root; 
  
    public SpiralTree() 
    { 
        root = null; 
    } 
    static int height(Node root) 
    { 
        //int a=0
        if (root == null) 
           return 0; 
        else
        { 
            int lheight = height(root.left); 
            int rheight = height(root.right); 
            if (lheight >= rheight) 
                 return(lheight+1); 
            else 
                return(rheight+1);  
        } 
    } 
    static void print(Node root){
        int h=height(root);
        for(int i=0;i<h;i=i+2){
            printLeftLevel(root,i);
            printRightLevel(root,i+1);
        }
        }
    static void printLeftLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printLeftLevel(root.left, level-1); 
            printLeftLevel(root.right, level-1); 
        } 
    }   
    static void printRightLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printRightLevel(root.right, level-1); 
            printRightLevel(root.left, level-1); 
        } 
    }   
    static Node insert(Node root, int data)  
   {  
    Node node= new Node(data);
    if(root==null){
        return node;
    } 
    Node parent=null, current = root;
    while(current!=null){
        parent=current;
        if(current.data>=data){
            current=current.left;
        }
        else{
            current=current.right;
        }
    }
    if(parent.data>=data){
        parent.left=node;
    }
    else{
        parent.right=node;
    }
    return root;
    }
public static void main(String args[])  
{

    Node root = null;  
    root = insert(root, 50);  
    insert(root, 30);  
    insert(root, 20);  
    insert(root, 40);  
    insert(root, 70);  
    insert(root, 60);  
    insert(root, 80);   
    print(root);
}  
}