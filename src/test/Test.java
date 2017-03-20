package test;

import common.ArrayUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		int[] arr = ArrayUtils.generateArr(10);
		ArrayUtils.printArr(arr);
		System.out.println();
		quickSort(arr);
		ArrayUtils.printArr(arr);
		
		System.out.println();
		mergeSort(arr);
		ArrayUtils.printArr(arr);
		
		System.out.println();
		selectSort(arr);
		ArrayUtils.printArr(arr);
		
		System.out.println();
		insertSort(arr);
		ArrayUtils.printArr(arr);
		
		System.out.println();
		bubleSort(arr);
		ArrayUtils.printArr(arr);
		System.out.println();
		int[] arr1 = new int[]{1,2,4,5,6,7};
		System.out.println(binSearch(arr1,11));
	}
	
	/**
	 * ���������˼��:ͨ��һ���������зָ�Ϊ�������֣�����һ���ִ��ڻ�������һ����С�ڻ���,�����Գ��Ƚ϶̵�
	 * �����н��зָ����մﵽ��������,���ڷָ�������ֲ���Ҫ�Ƚ����Լ�����ʱ�临�Ӷ�
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void quickSort(int[] arr){
		if(arr==null||arr.length==0){
			throw new NullPointerException("����Ϊ��");
		}
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int i, int length) {
		if(i<length){
			int division = partition(arr,i,length);
			quickSort(arr,i,division-1);
			quickSort(arr,division+1,length);
		}
		
	}

	private static int partition(int[] arr, int i, int length) {
		int base = arr[i];
		while(i<length){
			while(arr[length]>=base&&i<length){
				length--;
			}
			arr[i] =arr[length];
			while(arr[i]<=base&&i<length){
				i++;
			}
			arr[length] = arr[i];
		}
		arr[length] = base;
		return i;
	}
	
	/**
	 * ���õ��Ƿ���˼�룺������������кϲ��õ���������С�
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void mergeSort(int[] arr){
		if(arr==null||arr.length==0){
			throw new NullPointerException("����Ϊ��");
		}
		mergeSort(arr,0,arr.length-1);
	}

	private static void mergeSort(int[] arr, int i, int j) {
		int mid = (i+j)/2;
		if(i<j){
			mergeSort(arr,i,mid);
			mergeSort(arr,mid+1,j);
			merge(arr,i,mid,j);
		}
	}

	/**
	 * �鲢������÷���˼�룬��������������кϲ��õ���ȫ��������С�
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	private static void merge(int[] arr, int i, int mid, int j) {
		int[] temp = new int[j-i+1];
		int k = 0;
		int left = i;// ��ָ��  
        int right = mid + 1;// ��ָ��  
		while(left<=mid&&right<=j){
			if(arr[i]<arr[j]){
				temp[k++] = arr[left++];
			}else{
				temp[k++] = arr[right++];
			}
		}
		while(left<=mid){
			temp[k++] = arr[left++];
		}
		while(right<=j){
			temp[k++] = arr[right++];
		}
		for(int n = 0;n<temp.length;n++){
			arr[i+n] = temp[n];
		}
	}
	
	/**
	 * ÿ�δ�n-i+1��Ԫ����ѡ����С��Ԫ����Ϊ�������еĵ�i��Ԫ��
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void selectSort(int[] arr){
		int n = arr.length;
		for(int i = 0;i<n;i++){
			int minIndex = i;
			for(int j= i+1;j<n;j++){
				if(arr[j]<arr[i]){
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	/**
	 * ÿ�ν�һ��������ļ�¼���뵽�Ѿ�����ļ�¼��
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void insertSort(int[] arr){
		int n = arr.length-1;
		int i,j,k;
		for(i = 1;i<n;i++){
			for(j = i-1;j>0;j--){
				if(arr[i]>arr[j]){
					break;
				}
			}
			if(j!=i-1){
				for(k = i-1;k>j;k++){
					arr[k+1] = arr[k];
				}
				arr[k+1] = arr[i];
			}
		}
	}
	
	/**
	 * ð�������˼��:�ظ����߹����������У�һ�αȽ�����Ԫ��,������ǵ�˳�������Ͱ����ǽ���������
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void bubleSort(int[] arr){
		int n =arr.length-1;
		for(int i = 0;i<n;i++){
			for(int j = n-i+1;j<n;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * ���ֲ��ҷ�
	 * @author ����
	 * @date 2017��3��20��
	 * @param 
	 * @return 
	 * @throws
	 */
	public static int binSearch(int[] arr,int num){
		return binSearch(arr,0,arr.length-1,num);
	}
	
	public static int binSearch(int[] arr,int low,int high,int num){
		int mid = (low+high)/2;
		if(low>high){
			return -1;
		}
		if(arr[mid] ==num){
			return mid;
		}else{
			if(arr[mid]>num){
				return binSearch(arr,low,mid-1,num);
			}else{
				return binSearch(arr,mid+1,high,num);
			}
		}
	}
}
