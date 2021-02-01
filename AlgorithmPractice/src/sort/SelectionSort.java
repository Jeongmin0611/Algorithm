package sort;
import java.util.Random;

public class SelectionSort {
	//���� �迭�� �����ϴ� �޼ҵ�
		void createRandomNumber(int[] arr) {
			Random ran=new Random();
			for(int i=0;i<arr.length;i++){
				arr[i]=ran.nextInt(300)+1;
			}
		}
		void selectionSort(int[] arr) {
			int indexMin;
			for(int i=0;i<arr.length;i++) {
				indexMin=i;//������ �� �ε��� �����ϴ� ����
					//i(�ڱ�����)���� �������� �� ���������ٴ� �ǹ�
				for(int j=i+1;j<arr.length;j++) {
					//������ ���ڰ� ���� ���ں��� ��ũ��
					if(arr[indexMin]>arr[j])indexMin=j;
				}
				int temp=arr[indexMin];
				arr[indexMin]=arr[i];
				arr[i]=temp;
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
			SelectionSort ss=new SelectionSort();
			ss.createRandomNumber(arr);
			System.out.println("���� ��");
			ss.printArray(arr);
			
			ss.selectionSort(arr);
			System.out.println();
			System.out.println("���� ��");
			ss.printArray(arr);
		}
}