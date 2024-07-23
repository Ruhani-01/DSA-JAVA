public class Target {
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int t = 0;
        int n = arr.length;
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        
        while (s <= e) {
            int m = (s + e) / 2;
            // equal
            if (arr[m] == t) {
                ans = m;
                break;
            }
            
            // Check if the left half is sorted
            if (arr[s] <= arr[m]) {
                // Check if target is in the left half
                if (arr[s] <= t && t < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else { // Right half is sorted
                // Check if target is in the right half
                if (arr[m] < t && t <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        
        System.out.print(ans);
    }
}
