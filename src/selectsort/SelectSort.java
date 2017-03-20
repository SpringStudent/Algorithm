package selectsort;

import common.ArrayUtils;

public class SelectSort {

	public static void main(String[] args) throws Exception {
		int[] arr = ArrayUtils.generateArr(10);
		ArrayUtils.printArr(arr);
		System.out.println();
		selectSort(arr);
		ArrayUtils.printArr(arr);
	}

	/**
	 * ÿ�δ�n-i+1��Ԫ����ѡ��ؼ�����С��Ԫ����Ϊ�������еĵ�i��Ԫ��
	 * @author ����
	 * @date 2017��3��9��
	 * @param arr
	 * @return
	 * @throws
	 */
	public static void selectSort(int[] arr) {
		int length = arr.length;
		int i, j, nMinIndex;  
	    for (i = 0; i < length; i++)  
	    {  
	        nMinIndex = i; //����СԪ�ص�λ��  
	        for (j = i + 1; j < length; j++){  
	            if (arr[j] < arr[nMinIndex]){  
	                nMinIndex = j;  
	            }
	        } 
	        swap(arr,i,nMinIndex); //�����Ԫ�طŵ��������Ŀ�ͷ  
	    }  
	}
	
	/**
	 * ��������Ԫ��
	 * @author ����
	 * @date 2017��3��9��
	 * @param a
	 * @param b
	 * @return
	 * @throws
	 */
	private static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
