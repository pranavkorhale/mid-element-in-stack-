/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
   static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    
    static Node head = null;
    static Node tail = null;
    static Node mid = null;
    static int count = 0;
    public static void push(int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            head = temp;
            mid = head;
            tail = head;
            count++;
            return;
        }
        
        tail.next = temp;
        Node temp2 = tail;
        tail = tail.next;
        tail.prev = temp2;
        count++;
        if(count%2==1)
        {
            mid = mid.next;
        }
    }
    
    public static  void pop()
    {
        if(head==null)
        {
            System.out.println("underflow...");
            return;
        }
        
        tail = tail.prev;
        tail.next = null;
        count--;
        if(count%2==0)
        {
            mid = mid.prev;
        }
        
    }
    
    
    
	public static void main(String[] args) {
        push(10);
        push(11);
        push(12);
        push(13);
        push(15);
        System.out.println("mid element is "+mid.data);
        pop();
        System.out.println("mid element is "+mid.data);
	}
}
