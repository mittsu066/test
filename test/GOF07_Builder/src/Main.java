public class Main{
	public static void main(String[] args){
		if(args.length != 1){
			usage();
			System.exit(0);
		}
		if("plain".equals("plain")){
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
			System.out.println(result);
		}else if("html".equals("html")){
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getResult();
			System.out.println(filename + "が作成されました。");
		}else{
			usage();
			System.exit(0);
		}
	}
	public static void usage(){
		System.out.println("Usage: java Main plan　　　プレーンテキストで書類作成");
		System.out.println("Usage: java Main html　　　HTMLファイルで書類作成");
	}
}