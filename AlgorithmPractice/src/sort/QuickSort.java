package sort;
import java.util.Random;

public class QuickSort {
		//���� �迭�� �����ϴ� �޼ҵ�
		void createRandomNumber(int[] arr) {
			Random ran=new Random();
			for(int i=0;i<arr.length;i++){
				arr[i]=ran.nextInt(300)+1;
			}
		}
			//				�迭	 �����ε���	�������ε���
		void quickSort(int[] arr,int l,int r) {
			
			if(l<r){//���� �ε����� 1���� �� ������
				
				int pivot=partition(arr,l,r);
				
				quickSort(arr,l,pivot-1);
				quickSort(arr,pivot+1,r);
				
			}
		}
				//		�迭	 �����ε���	�������ε���
		int partition(int[]arr,int l,int r) {
			int pivot=arr[r];//���� �� �����ʿ� �ִ� �ε����� �Ǻ����� ����.
			int i=(l-1);//�Ǻ����� ���� �ε����� ������ �˷��ִ� �뵵�� ����
			
			for(int j=l;j<=r-1;j++){
				if(arr[j]<=pivot){//�Ǻ� �ε��� ���Һ��� �ش� ���Ұ� �۴ٸ�
					i++;//�Ǻ����� ���� ������ ���� ����
					
					//����
					int tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
			//���������� ���� ū ���Ҹ� �Ǻ� �ε����� ���ҿ� ����
			int tmp=arr[i+1];
			arr[i+1]=arr[r];
			arr[r]=tmp;
			return (i+1);
		}
		
		void printAll(int[] arr,String msg) {
			System.out.printf("%s:",msg);
			for(int i=0;i<arr.length;i++){
				System.out.printf("\t %d",arr[i]);
			}
			System.out.println();
		}
	
		public static void main(String[] args) {
			//int[] arr= {70,20,50,10,30,40};
			int[] arr=new int[6];
			
			QuickSort qs=new QuickSort();
			qs.createRandomNumber(arr);
			qs.printAll(arr,"���� ��:");
			qs.quickSort(arr, 0, arr.length-1);
			qs.printAll(arr,"���� ��:");
		}

}