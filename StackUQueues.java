//Stack using two Queues
import java.util.*; 
class StackUQueues { 
  
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<Integer>(); 
        static Queue<Integer> q2 = new LinkedList<Integer>();
        static int curr_size; 
  
        Stack() { 
            curr_size = 0; 
        } 
    
  
        static void push(int x) { 
            curr_size++;
            q2.add(x);
            while (!q1.isEmpty()) { 
                q2.add(q1.peek()); 
                q1.remove(); 
            }  
            Queue<Integer> q = q1; 
            q1 = q2; 
            q2 = q; 
        } 
        static void pop() {
            if (q1.isEmpty()) 
                return; 
            q1.remove(); 
            curr_size--; 
        } 
        static int top() { 
            if (q1.isEmpty()) 
                return -1; 
            return q1.peek(); 
        } 
  
        static int size() { 
            return curr_size; 
        } 
    }
    
    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        System.out.println("current size: " + s.size()); 
        System.out.println(s.top()); 
        s.pop(); 
        System.out.println(s.top()); 
        s.pop(); 
        System.out.println(s.top()); 
        System.out.println("current size: " + s.size()); 
    } 
} 