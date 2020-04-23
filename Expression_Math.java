package com.algos;
import java.util.Stack;

public class Expression_Math {

	public static void main(String[] args) {
		String exp = "2*3+5-1-1-1-1-1";
		String exp2 = "20*13+65-31-51-13-15-14";
		String exp3 = "20*13+65-31-51-(13-15-14)";
		
		
		Stack<String> stack = new Stack<String>();
		Stack<String> charStack = new Stack<String>();
		
		char[] chars = exp.toCharArray();
		for(int i=0; i<chars.length; i++) {
			char tempChar = chars[i];
			if(tempChar=='*' || tempChar=='/' || tempChar=='+' || tempChar=='-'){
				String a = charStack.pop();
				stack.push(a);
				stack.push(String.valueOf(tempChar));
			}else if(tempChar==')' || tempChar=='('){
			}else {
					if(charStack.size()!=0) {
					String a = charStack.pop();
					charStack.push(a+String.valueOf(tempChar));
					}else {
						charStack.push(String.valueOf(tempChar));
					}
			}
		}
		stack.push(charStack.pop());
		System.out.println(stack.toString());
		Stack<String> finaStack = new Stack<String>();
		for(int i=0; i<stack.size(); i++) {
			String a = stack.get(i);
			if(a.equals("*")) {
				i++;
				String b = stack.get(i);
				int c = Integer.parseInt(finaStack.pop())*Integer.parseInt(b);
				finaStack.push(String.valueOf(c));
			}else if(a.equals("/")) {
				i++;
				String b = stack.get(i);
				int c = Integer.parseInt(finaStack.pop())/Integer.parseInt(b);
				finaStack.push(String.valueOf(c));
			}else if(a.equals("+")) {
				i++;
				String b = stack.get(i);
				int c = Integer.parseInt(finaStack.pop())+Integer.parseInt(b);
				finaStack.push(String.valueOf(c));
			}else if(a.equals("-")) {
				i++;
				String b = stack.get(i);
				int c = Integer.parseInt(finaStack.pop())-Integer.parseInt(b);
				finaStack.push(String.valueOf(c));
			}else {
				finaStack.push(a);
			}
		}
		System.out.println(finaStack);
	}
}
