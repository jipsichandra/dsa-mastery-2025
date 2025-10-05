
public class BinarySearch{
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,45,55,56,78,79,80,88,89,90,100};
        int target=80;
        int result=binarySearch(arr, target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        while(start<=end)
        {
            if(target< arr[mid])
            {
                end=mid-1;
            }
            else if(target > arr[mid])
            {
               start=mid+1;
            }else{
                // target == mid
                return mid;
            }
        }
       return -1;
    }
}
