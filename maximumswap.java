#leetcode daily solution(670. Maximum Swap)
class Solution {
    public int maximumSwap(int num) {
      String str=Integer.toString(num);
      char[] arr=str.toCharArray();
      int max=num;
      int n=arr.length;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                char temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                max=Math.max(max,Integer.parseInt(new String(arr)));
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      } 
      return max; 
    }
}
