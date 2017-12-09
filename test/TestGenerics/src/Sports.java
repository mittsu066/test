	public enum Sports{
        BASEBALL("101","野球"),
        SOCCER("102","サッカー"),
        TENNIS("103","テニス");

        private String code;
        private String name;

        Sports(String code,String name){
            this.code = code;
            this.name = name;
        }
        public String getCode(){
            return code;
        }
        public String getName(){
            return name;
        }
}
