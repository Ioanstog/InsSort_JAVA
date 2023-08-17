package InsertionSort;

public class Test_Ins_Sort {
    public static void main (String[] args  ){
        int [] numbers = {3, 9, 6, 1, 2};
        Insertion_Sort.sort (numbers);
        
        for (int i=0; i < numbers.length; i++ )
            System.out.println(numbers[i]);
    } 
}
