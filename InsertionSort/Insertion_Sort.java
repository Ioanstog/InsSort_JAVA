package InsertionSort;

class Insertion_Sort {

    public static void sort (int[] numbers){

        for(int i=1; i < numbers.length; i++){
            int current = numbers[i];
            int position = i;
            
            // shift larger values to the right
            while(position>0 && numbers[position-1] > current){
                numbers[position] = numbers[position -1];
                position--; 
            }
            numbers[position] = current;

        }
    }
}
