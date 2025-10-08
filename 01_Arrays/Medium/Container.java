// container with most water
// input: int[] heights={1,8,6,2,5,4,8,3,7};
// output: 49
// need : 2 points (point 1 and point 2)
// move shorter pointer
public class Container {
    public static void main(String[] args) {
        int[] heights={1,8,6,2,5,4,8,3,7};
        int[] heights2=new int[10000];

        for(int i=0;i<heights2.length;i++)
        {
          heights2[i]=(i%2==0)?1:2;
        }

        int max =containerFind(heights);
        System.out.println("container can contain most : "+max);
         int max2 =containerFind(heights2);
        System.out.println("container can contain most : "+max2);
    }
    static int containerFind(int[] arr){
        int mostWater=0;
        int left=0;
        int right=arr.length-1;
           
           while(left!=right)
        {
            int nowWater=Math.min(arr[left],arr[right])*(right-left);
           if(mostWater<nowWater)
           {
             mostWater=nowWater;
           }


              if(arr[left]>arr[right])
           {
            right--;
           }else
           {
            left++;
           }
        }
          
        return mostWater;
    }
    
}
