public class Main{
/*
Write a program that calculates the sum of all the 
numbers between 1 and 1000 that are divisible by both 3 
and 5 using a for loop.
*/
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=15; i++){
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
                System.out.printf(" %d +", i); 
            }
            //System.out.println(i); 
        }
        System.out.printf(" = %d", sum);        
    }

}