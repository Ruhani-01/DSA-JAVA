public class shortest{
    public static void main(String[] args) {
        String path="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
            
        }
        double ans=Math.sqrt((Math.pow(x, 2)+Math.pow(y,2)));
        System.out.println(ans);
    }
}