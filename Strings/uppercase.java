public class  uppercase{
    public static void main(String[] args) {
        String st="my name is love";
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(st.charAt(0)));
        for(int i=1;i<st.length();i++){
            if(st.charAt(i)==' ' && i<st.length()-1){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                sb.append(st.charAt(i));
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}