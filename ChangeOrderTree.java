import java.util.*;
public class ChangeOrderTree
{
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data=data;
			Node left=right=null;
		}
	}
	static Node root;
	static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		else{
		return;
		}
	}
	static void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
		else{
			return;
		}
	}
	static Node insert(Node root, int data){
		if(root!=null){
			if(data<root.data){
				root.left=insert(root.left,data);
			}
			else{
				root.right=insert(root.right,data);
			}
		}
		else{
			root=new Node(data);
			return root;
		}
		return root;
	}
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		ChangeOrderTree tree= new ChangeOrderTree();
	for(int i=0;i<7;i++){
		int x=sc.nextInt();
		root=insert(root,x);
	}
	inOrder(root);
	postOrder(root);
	}
}