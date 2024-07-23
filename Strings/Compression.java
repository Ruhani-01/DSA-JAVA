public class Compression {
    public static void main(String[] args) {
        String st = "aabbbbccc";
        StringBuilder s = new StringBuilder("");
        
        for (int i = 0; i < st.length(); i++) {
            int c = 1;
            while (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) {
                c++;
                i++;
            }
            s.append(st.charAt(i));
            if (c > 1) {
                s.append(String.valueOf(c));
            }
        }
        
        System.out.println(s.toString());
    }
}
