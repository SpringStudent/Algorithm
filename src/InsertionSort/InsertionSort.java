package insertionsort;

import common.ArrayUtils;

public class InsertionSort {

	public static void main(String[] args) throws Exception {
		int[] arr = ArrayUtils.generateArr(10);
		ArrayUtils.printArr(arr);
		System.out.println();
		insertionSort(arr);
		ArrayUtils.printArr(arr);
	}

	/**
	 * ��������
	 * @author ����
	 * @date 2017��3��9��
	 * @param
	 * @return
	 * @throws
	 */
	private static void insertionSort(int[] a) {
		int length = a.length;
		int i, j, k;
		for (i = 1; i < length; i++) {
			// Ϊa[i]��ǰ���a[0...i-1]������������һ�����ʵ�λ��
			for (j = i - 1; j >= 0; j--) {
				if (a[j] < a[i]) {
					break;
				}
			}
			if (j != i - 1) {
				// ����a[i]������������
				int temp = a[i];
				for (k = i - 1; k > j; k--){
					a[k + 1] = a[k];
				}
				// ��a[i]�ŵ���ȷλ����
				a[k + 1] = temp;
			}
		}
	}
}
