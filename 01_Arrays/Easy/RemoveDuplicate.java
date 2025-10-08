
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4};
        int length=removeDuplicate(arr);
        for(int i=0;i<length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    static int removeDuplicate(int[] arr)
    {
        int length=0;
        for(int position=1;position<arr.length;position++)
        {
            if(arr[length]!=arr[position])
            {
              arr[++length]=arr[position];
            }
        }
        return length+1;
    }

    
    }
