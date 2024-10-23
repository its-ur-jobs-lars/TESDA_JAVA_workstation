package Task10;

public class Tasksheet120 {


    public static int CumulativeSum(int... numbers){
        int totalsum = 0;

        for (int num: numbers){
            int CulSum = 0;

            for (int i= 1; i <= num; i++){
                CulSum += i;
            }

            System.out.println("Cumulative for number " + num + " is " + CulSum);

            totalsum += CulSum; 

        }
        return totalsum; 

        }
    
    public static void main(String[] args) {
        int totalsum = CumulativeSum(4, 5, 10);

        System.out.println("Total sum of Cumulative sum is " + totalsum);
    }
}