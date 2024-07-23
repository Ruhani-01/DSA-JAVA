public  class lagest{
    public static void main(String[] args) {
        String st[]={"apple","banana","mango"};
        String large=st[0];
        for(int i=1;i<st.length;i++){
            if(large.compareTo(st[i])>=0){
                continue;
            }
            else{
                large=st[i];
            }

        }
        System.out.println(large);
    }
}