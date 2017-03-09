package common;

import java.util.Random;

public final class ArrayUtils {

	/**
	 * ����һ������Ϊlength������
	 * @author ����
	 * @date 2017��3��9��
	 * @param length
	 * @return
	 * @throws Exception
	 */
	public static int[] generateArr(int length) throws Exception{
		if(length<=0){
			throw new Exception("���鳤�Ȳ���С�ڵ���0");
		}
		int[] arr = new int[length];
		Random random = new Random();
		for(int i = 0;i<length;i++){
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	
	/**
	 * ��ӡ����Ԫ�ص�����̨
	 * @author ����
	 * @date 2017��3��9��
	 * @param arr
	 * @return
	 * @throws
	 */
	public static void printArr(int[] arr){
		int length = arr.length;
		for(int i = 0;i<length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
