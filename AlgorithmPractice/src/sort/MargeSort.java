package sort;

public class MargeSort {
 
	static void margeSort(int[] a, int low, int high) {
		
		//���̻� ���� �ε����� ���ٸ�(�迭�� ���Ұ� 1���� ��)
		if(low<high) {
			int mid=(low+high)/2;
			
			//���ұ׷��� ����
			margeSort(a,low,mid);
			
			//���ұ׷��� ������
			margeSort(a,mid+1,high);
		
			//������ ����
			marge(a,low,mid,high);
		}
	}
	
	static void marge(int[] a,int low,int mid, int high) {
		int[] tmp=new int[a.length];//���ĵ� ���ҵ��� �ӽ������� �迭
		int i=low;//�迭�� �����ε���
		int j=mid+1;//�迭�� �߰� ���� �ε���
		int k=0;//�ӽù迭�� �� �ε��� ����
		
		//���ʹ迭�� ������ ������
		while(i<=mid&&j<=high) {
			if(a[i]<=a[j]){
				tmp[k]=a[i];
				i++;
				k++;
			}else {
				tmp[k]=a[j];
				j++;
				k++;
			}
		}
		
		//���� �迭�� �����ߴٸ�
		while(i<=mid) {
			tmp[k]=a[i];
			i++;
			k++;
		}
		
		//������ �迭�� �����ߴٸ�
		while(j<=high) {
			tmp[k]=a[j];
			j++;
			k++;
		}
		
		k--;//�ε��� ������ �迭 �ε��� ������ ������ �Ǵϱ� -1������ ������
		
		//�ӽù迭���� ��¥ �迭�� �ű�
		while(k>=0) {
			a[low+k]=tmp[k];
			k--;
		}
 	}
	
	static void printAll(int[] arr,String msg) {
		System.out.printf("%s:",msg);
		for(int i=0;i<arr.length;i++){
			System.out.printf("\t %d",arr[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={20,10,70,80,40,90};
		String msg="���� ��";
		printAll(arr,msg);
		margeSort(arr, 0, arr.length-1);
		msg="���� ��";
		printAll(arr,msg);

	}

}