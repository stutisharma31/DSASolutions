public class TrappingRainwater {
    public static int TrappingRain(int height[]){
        int n=height.length;
        //calculate leftmax boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        
        //loop
        for(int i=0;i<n;i++) {
            //water-level=min(left-max bound-right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped-water=water-level-height[i]
            trappedWater += waterLevel - height[i];
        }
       return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,3,5,6,8};
        System.out.println(TrappingRain(height));;
    }

}
