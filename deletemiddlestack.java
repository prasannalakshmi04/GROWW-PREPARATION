import java.util.* ;
import java.io.*; 
public class deletemiddlestack {
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
		int k = (inputStack.size()-1)/2;
		solve(inputStack,k);
	}
	private static void solve(Stack<Integer> stack, int k){
		if(k == 0){
			stack.pop();
			return;
		}
		int top = stack.pop();
		solve(stack,k-1);
		stack.push(top);
	}
}
