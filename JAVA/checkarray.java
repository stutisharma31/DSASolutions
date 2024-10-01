class checkarray {
  public boolean canArrange(int[] arr, int k) {
     int[] remcount=new int[k];
     for(int num:arr){
      int rem=num%k;
      if(rem<0){
          rem+=k;
      }
      remcount[rem]++;
     }
     for(int i=1;i<k;i++){
      if(remcount[i]!=remcount[k-i]){
          return false;
      }
     }
     if(remcount[0]%2!=0){
      return false;
     }
     return true;
  }
}
