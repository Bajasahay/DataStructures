package CodeStudio;

public class Permutation {

    public int costToProcess(int n, int[] arr) {
        // Write your code here.

        int[] hash = new int[n+1];
        for(int i =0; i<n; i++) {
            hash[arr[i]] = i;
        }
        for(int i =0; i<n; i++) {
            System.out.println(hash[i]);
        }
        return 0;
    }
}
