package sort;
import java.util.Random;

public class BubbleSort {
	//���� �迭�� �����ϴ� �޼ҵ�
	int[] createRandomNumber(int[] arr) {
		Random ran=new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=ran.nextInt(300)+1;
		}
		return arr;
	}
	
	void bubbleSort(int[] arr) {
			//��ü ��ȸ Ƚ��(������ ���� �ڵ� ����)
		for(int i=0;i<arr.length;i++ ) {
				// i�� �̹� ���ĵ� ���ڰ���,-1�� �����ϴ� �ڱ��ڽ�
			for(int j=0;j<arr.length-i-1;j++){
				//�ռ��ڰ� �������ں��� ũ��
				if(arr[j]>arr[j+1]){
					int tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	void printArray(int[] arr){
		int t=0;
		for(int a:arr){
			if(t==5) {
				System.out.printf("%s ",a);
			}else {
				System.out.printf("%s, ",a);
				t++;
			}
			
		}
		
	}
	
	public static void main(String[] args) {	
		
		int[] arr=new int[6];
		BubbleSort bs=new BubbleSort();
		bs.createRandomNumber(arr);
		
		System.out.println("���� ��");
		bs.printArray(arr);
		
		bs.bubbleSort(arr);
		System.out.println();
		System.out.println("���� ��");
		bs.printArray(arr);
	}
}