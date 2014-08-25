package cn.ahern88.sort;

/**
 * ð������
 * ����˼�룺
	��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵�����
	�ýϴ�������³�����С������ð������ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
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
