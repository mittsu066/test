package enumtest;

import enumtest.CodeEnum.*;

public class CodeUtil {
	
	public static void main(String[] args){
		String vocal = CodeUtil.getLabel(Globe.class, 12);
		System.out.println("ボーカル：" + vocal);
	}
	
	public static <E extends CodeEnumIF> String getLabel(Class<E> enumClass, int value) {
		String label = "";
		for (E e : enumClass.getEnumConstants()) {
			if (e.getValue() == value) {
				label = e.getLabel();
				break;
			}
		}
		return label;
	}
}
