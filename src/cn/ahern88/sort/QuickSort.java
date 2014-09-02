package cn.ahern88.sort;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] values = {213,12,245,26,38,17,192,166,178,22,18,25,45,29,9,5,288,244,10,27};
		for(int value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
		quickSort(values, 0, values.length - 1);
	}

	private static int getMiddle(Integer[] values, int low, int high) {
		int baseValue = values[low];
		while(low < high) {
			while (low < high && values[high] > baseValue) {
				high--;
			}
			values[low] = values[high];
			while (low < high && values[low] < baseValue) {
				low++;
			}
			values[high] = values[low];
		}
		values[low] = baseValue;
		return low;
	}
	
	private static void quickSort(Integer[] values, int low, int high) {
		if (low < high) {
			int middle = getMiddle(values, low, high);
			for(int value : values) {
				System.out.print(value + " ");
			}
			System.out.println();
			quickSort(values, low, middle - 1);
			quickSort(values, middle + 1, high);
		}
	}

}
