	
	    //ジェネリクスを使ったクラスを定義
	    public class Container<S>{
	    	
	        //変数の型として型変数を使うことが出来る
	        private S value;

	        //引数の型として型変数を使うことが出来る
	        Container(S value){
	            this.value = value;
	        }

	        //メソッドの戻り値として型変数を使うことが出来る
	        S get(){
	            return value;
	        }
	    }
