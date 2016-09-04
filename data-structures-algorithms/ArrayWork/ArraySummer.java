import java.util.*;
public class ArraySummer
{
        public static int arraySum(int[] arr, int first)
        {
                
                if(first == 0)
                {
                        return arr[0];
                }
                else
                return arr[first] + arraySum(arr, first-1);
               
        }
        
        public static void main(String[] args)
        {
                int[] nums = new int[10];
                Scanner scan = new Scanner(System.in);
                System.out.println("enter 10 numbers: ");
                for(int i = 0; i<10; i++)
                {
                        nums[i] = scan.nextInt();
                        scan.nextLine();
                }        
                
                System.out.println("Sum is: " +arraySum(nums, nums.length-1));
        }
}
