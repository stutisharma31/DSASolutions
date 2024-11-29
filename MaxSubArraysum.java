public class MaxSubArrSum {
    public static void MaxSum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];

        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=0;j<numbers.length;j++){
                int end=j;
                currSum=start ==0 ? prefix[end]:prefix[end]-prefix[start-1];

            }
        }
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
    }
}
