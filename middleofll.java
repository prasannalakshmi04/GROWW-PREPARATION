



 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }


//BRUTEFORCE
// public class Solution
// {
//     public static Node findMiddle(Node head)
//     {
//         int count = 0;
//         Node temp = head;
//         while(temp!= null){
//             count = count+1;
//             temp = temp.next;
//         }
//         temp = head;
//         int resultnode = (count/2)+1;
//         int counter = 1;
//         while(temp!=null && counter<resultnode){
//             counter++;
//             temp = temp.next;
//         }
//         return temp;
//     }
// }

public class middleofll
{
    public static Node findMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
