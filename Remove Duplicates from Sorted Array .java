public class Solution {
    public int removeDuplicates(int[] A) {
        int len = A.length;
        if(len < 2){
            return len;
        }
        
        int head = 0;
        int tail = 1;
        
        for(; tail < len; tail++){
            if(A[head] != A[tail]){
                A[++head] = A[tail];
            }
        }
        return head+1;
    }
}
