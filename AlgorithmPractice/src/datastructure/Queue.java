package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {
	//큐는 한방향에서 한방향으로, 선입선출 방식의 자료구조이다.
	
	List<Integer> queue=new ArrayList<Integer>();
	
	public void enqueue(int n){//자동 형변환 가능
		queue.add(n);//큐에 원소 삽입
	}
	
	public int dequeue(){
		if(queue.isEmpty()){//큐가 아예 비어있을 시 예외 처리
			System.out.println("queue is empty");
			throw new NoSuchElementException();
		}
		return queue.remove(0);//가장 앞과 가까운 원소를 제거
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue=new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		while(!queue.isEmpty()){
			System.out.println(queue.dequeue());
		}
	}

}
