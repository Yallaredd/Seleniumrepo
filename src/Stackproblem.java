import java.util.Stack;

public class Stackproblem {

	public static void main(String[] args) {

		//Creating Stack
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println("stack elemnts are:"+stk);
		
		
		System.out.println("pop:"+stk.pop());
		System.out.println("Stack"+stk);

		System.out.println("peek:"+stk.peek());
		System.out.println("pop:"+stk);
		
		if(stk.empty())
		{
			System.out.println("Stack is empty)");
		}
		else
		{
			stk.pop();
			System.out.println("Stack is not empty");
		}

	
	}

}
