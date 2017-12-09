package cast;

public class WeaknessOfCast {
	public static void main(String[] args) {
		WeaknessOfCast weaknessOfCast = new WeaknessOfCast();
				weaknessOfCast.math();
	}
	
	private void math(){
		System.out.println("少数＋数字：" + 1.2 + 1);
		System.out.println("メソッド＋数字" + getDouble() + 1);
		System.out.println(getDouble() + 1);
		Generic generic = new Generic();
		generic.setValue(2.5);
		System.out.println(""+generic.getValue() + getTNumbers(1));
		System.out.println(""+generic.getValue() + getObjectNumbers(1));
	}
	
	private double getDouble(){
		return 1.3;
	}
	
	private <T> T getTNumbers(T value){
		T t = value;
		return t;
	}
	
	private <T> Object getObjectNumbers(T value){
		Object o = value;
		return o;
	}
}
