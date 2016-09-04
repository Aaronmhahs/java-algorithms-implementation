import java.util.*;

public class SeparateAndMerge
{
        public static void main(String[] args)
        {
                LList<Integer> listInt = new LList<Integer>();
                LList<Float> listFloat = new LList<Float>();
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter values and stuff: ");
                while(scan.hasNext())
                {
                        if(scan.hasNextInt())
                        {
                                listInt.add(scan.nextInt());
                        }
                        else if(scan.hasNextFloat())
                        {
                                listFloat.add(scan.nextFloat());
                        }
                        else
                        {
                                scan.next();
                        }
                }
                Iterator<Integer> intIter = listInt.iterator();
                Iterator<Float> floatIter = listFloat.iterator();
                System.out.print("Inputted Values: ");
                while(intIter.hasNext() || floatIter.hasNext())
                {
                       
                        if(intIter.hasNext())
                        {
                                System.out.print(intIter.next() + " ");
                        }
                        if(floatIter.hasNext())
                        {
                                System.out.print(floatIter.next() + " ");
                        }
                }
                System.out.println();
                
        }
}
