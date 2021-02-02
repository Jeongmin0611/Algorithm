package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {
	//ť�� �ѹ��⿡�� �ѹ�������, ���Լ��� ����� �ڷᱸ���̴�.
	
	List<Integer> queue=new ArrayList<Integer>();
	
	public void enqueue(int n){//�ڵ� ����ȯ ����
		queue.add(n);//ť�� ���� ����
	}
	
	public int dequeue(){
		if(queue.isEmpty()){//ť�� �ƿ� ������� �� ���� ó��
			System.out.println("queue is empty");
			throw new NoSuchElementException();
		}
		return queue.remove(0);//���� �հ� ����� ���Ҹ� ����
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
