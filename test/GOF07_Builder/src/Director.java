public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(){
		builder.makeTitle("Greeting");
		builder.makeString("朝から筆にかけて");
		builder.makeItems(new String[]{
				"おはようございます。",
				"こんにちわ。",
		});
		builder.makeString("夜に");
		builder.makeItems(new String[]{
				"こんばんわ。",
				"おやすみなさい。",
				"さようなら。"
		});
		builder.close();
	}
}