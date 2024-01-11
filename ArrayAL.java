//Michael, Tom, Thomas
public class ArrayAL {//The class for problem 4
    public static boolean atLeastOneOdd(int[] number){//go through the array and determine if there is odd number
        for(int i : number){
            if(i%2==1) return true;
        }
        return false;
    }
    public static void main(String[] args){//main method testing the function
        int number[] = {2,4,6,8,10};
        System.out.println(atLeastOneOdd(number));
    }
}