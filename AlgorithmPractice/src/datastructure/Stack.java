package datastructure;

import java.util.NoSuchElementException;

public class Stack {
	//스택은 LIFO 형태의 자료구조로, 인덱스를 1씩 조절해가며 스택을 구현한다. 
	
	private int[] arr;
	private int top=0;
	public Stack(int stackSize){
		this.arr=new int[stackSize];
	}
	
	void push(int i){
		if(top<arr.length){
			arr[top++]=i;
			System.out.println("pushed : "+i);
		}else {
			System.out.println("stack is overflow");
		}
	}
	
	int pop() {
		if(top>0){
			return arr[--top];
		}else {
			throw new NoSuchElementException();
		}
	}
	public static void main(String[] args){
		Stack stack=new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
