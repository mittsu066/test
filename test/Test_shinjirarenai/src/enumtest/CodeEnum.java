package enumtest;

import enumtest.CodeEnum.Globe;

public class CodeEnum {
 
	/**
	 * globeのEnum
	 */
	public enum Globe implements CodeEnumIF {
		/** 列挙定数の定義 */
		MARC("酒井龍一", 11),
		KEIKO("山田桂子", 12),
		TK("小室哲哉", 13);
 
		/** フィールド変数 */
		private String label;
		private int value;
 
		/** コンストラクタ */
		Globe(String label, int value) {
			this.label = label;
			this.value = value;
		}
 
		/** コード名称の取得（CodeEnumIF.getLabel の実装） */
		public String getLabel() {
			return this.label;
		}
 
		/** コード値の取得（CodeEnumIF.getValue の実装） */
		public int getValue() {
			return this.value;
		}
	}
 
	/**
	 * TM NETWORKのEnum
	 */
	public enum TmNetwork implements CodeEnumIF {
		/** 列挙定数の定義 */
		KINE("木根尚登", 11),
		UTSU("宇都宮隆", 12),
		KOMURO("小室哲哉", 13);
 
		/** フィールド変数 */
		private String label;
		private int value;
 
		/** コンストラクタ */
		TmNetwork(String label, int value) {
			this.label = label;
			this.value = value;
		}
 
		/** コード名称の取得（CodeEnumIF.getLabel の実装） */
		public String getLabel() {
			return this.label;
		}
 
		/** コード値の取得（CodeEnumIF.getValue の実装） */
		public int getValue() {
			return this.value;
		}
	}
}