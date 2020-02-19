package problemsolving;

import java.util.LinkedList;

public class Parenthesis {

  public static boolean isBalance(String string){

    LinkedList<Character> stack = new LinkedList();

    for(char c: string.toCharArray()){

      if(c=='{' || c=='[' || c=='('){
        stack.push(c);
      }

      char character = stack.size() == 0 ? ' ' : stack.pop();
      if(c=='}'){
        if(character!='{'){
          return false;
        }
      }else if(c==')'){
        if(character!='('){
          return false;
        }
      }else if(c==']'){
        if(character!='['){
          return false;
        }
      }else{
        stack.push(c);
      }

    }

    if(stack.size()>0){
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    System.out.println(isBalance("]({()})"));

  }

}
