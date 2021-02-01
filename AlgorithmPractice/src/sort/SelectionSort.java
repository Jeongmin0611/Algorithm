package sort;
import java.util.Random;

public class SelectionSort {
	//난수 배열을 생성하는 메소드
		void createRandomNumber(int[] arr) {
			Random ran=new Random();
			for(int i=0;i<arr.length;i++){
				arr[i]=ran.nextInt(300)+1;
			}
		}
		void selectionSort(int[] arr) {
			int indexMin;
			for(int i=0;i<arr.length;i++) {
				indexMin=i;//선택을 할 인덱스 지정하는 변수
					//i(자기차례)빼고 나머지를 다 루프돌린다는 의미
				for(int j=i+1;j<arr.length;j++) {
					//지정된 숫자가 비교할 숫자보다 더크면
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
			System.out.println("정렬 전");
			ss.printArray(arr);
			
			ss.selectionSort(arr);
			System.out.println();
			System.out.println("정렬 후");
			ss.printArray(arr);
		}
}
