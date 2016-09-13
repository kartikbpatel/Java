import java.util.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Parser
{
  private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
  static {
    brackets.put('[', ']');
    brackets.put('{', '}');
    brackets.put('(', ')');
  }  


  boolean checkParenthesesBalance(String str)
  {
    if (str.length() == 0) {
      throw new IllegalArgumentException("String length should be greater than 0");
    }
                // odd number would always result in false
    if ((str.length() % 2) != 0) {
      return false;
    }

    final Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < str.length(); i++) {
      if (brackets.containsKey(str.charAt(i))) {
        stack.push(str.charAt(i));
      } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
        return false;
      } 
    }
    return true;
  }
}

class StackB{

 public static void main(String []argh)
 {
  Scanner sc = new Scanner(System.in);
  Parser x = new Parser();

  while (sc.hasNext()) {
   String input=sc.next();
            //Complete the code
   System.out.println(x.checkParenthesesBalance(input));
 }

}
}
