import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to
 */
int [] num= { 50, -20, 0, 30, 40, 60, 10};
if (num[0]==num[num.length-1] )
    System.out.println("true");
else
    System.out.println("false");

/*
2.Write a Java program to find the numbers greater than the average of the
numbers of a given array
 */
   int [] number= { 1, 4, 17, 7, 25, 3, 100};
        int sum=0 ;
        for ( int s :number)
            sum=sum+s;

        int avr = sum/ number.length;
        System.out.println("the average " + avr);

        for(int n :number)
          if (n > avr)
        System.out.println(n + "  greater than the average");

        /*
    3.Write a Java program to get the larger value between first and last
element of an array of integers.
         */
        int largest ;
        int [] numbers = {20,30 ,40};

        if (numbers[0] > numbers [numbers.length-1]){
            largest= numbers[0];
            System.out.println(" Larger value between first and last element " + largest );}
        else{
            largest=numbers[numbers.length-1];
            System.out.println(" Larger value between first and last element: " + largest );}
     /*
 4.Write a Java program to swap the first and last elements of an array and
create a new array.
         */
        int [] original_array= {20,30,40};
int [] new_Array =Arrays.copyOf(original_array, original_array.length);
new_Array[0]=original_array[original_array.length-1];
new_Array[original_array.length-1]=original_array[0];
        System.out.print("New array after swapping the first and last elements:");
System.out.println(Arrays.toString(new_Array));
/*
5. Write a program that places the odd elements of an array before the
even elements.
 */

        int [] original= {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int n:original){
            if (n %2==0)
                even.add(n);
            else
                odd.add(n);}
        odd.addAll(even);
        System.out.println("new Array " + odd);


 /*
  6. Write a program that test the equality of two arrays.
 */

        int [] num1= {2,3,6,6,4};
        int [] num2= {2,3,6,6,4};
if (Arrays.equals(num1,num2))
    System.out.println(true);
else
    System.out.println(false);



    }
}