import java.io.*;
import java.util.* ;
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }



public class mergesortedll {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if (first == null) return second;
        if(second == null) return first;
        LinkedListNode<Integer> dummy = new LinkedListNode<>(-1);
        LinkedListNode<Integer> tail = dummy;
        while(first!=null && second!=null){
            if(first.data<second.data){
                tail.next = first;
                first = first.next;
            }
            else{
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }
        if(first!=null){
          tail.next = first;
        }
        if(second!=null){
            tail.next = second;
        }
        
        return dummy.next;
        
        

	}
}

