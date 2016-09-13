import java.util.*;
class StackA{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
			
			Stack<Character> st = new Stack();
			
			for(int i=0;i<input.length();i++){
				if(!st.empty()){
					switch(input.charAt(i)){
						case '}': if(st.peek()=='{'){st.pop();} break;
						case ')': if(st.peek()=='('){st.pop();} break;
						case ']': if(st.peek()=='['){st.pop();} break;
						default : st.push(input.charAt(i));
					}
				}
				else{
					st.push(input.charAt(i));    
				}
			}
			System.out.println(st.empty());
		}
	}
}