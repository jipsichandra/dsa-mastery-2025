public class LinearSearch {
   public static void main(String[] args) {
    int[] numbers={1,2,3,4,5};
    int target=3;

    int result=linearSearch(numbers, target);
    System.out.println(result);
    
   } 
   static int  linearSearch(int[] arr,int target)
   {
    if(arr.length ==0)
    {
        return -1;
    }

    for(int index=0;index<arr.length; index++)
    {
        int element=arr[index];
        if(element == target)
         return index;
       
    }

     return -1; 
   }
}
