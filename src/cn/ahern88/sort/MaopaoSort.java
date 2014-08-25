package cn.ahern88.sort;

/**
 * 冒泡排序
 * 基本思想：
	在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
	让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 *
 */
public class MaopaoSort {

	public static void main(String[] args) {
		Integer[] source = new Integer[]{16,9,23,10,7,12,29,24};
		for (Integer i : source) {
			System.out.print(i + " ->");
		}
		System.out.println();
		Integer[] target = sort(source);
		for (Integer i : target) {
			System.out.print(i + " ->");
		}
		System.out.println();
	}
	
	public static Integer[] sort(Integer[] source) {
		for(int i = 0; i< source.length; i++) {
			for(int j = i; j < source.length; j++) {
				if(source[i] > source[j]){
					int temp = source[i];
					source[i] = source[j];
					source[j] = temp;
				}
			}
		}
		return source;
	}

}
