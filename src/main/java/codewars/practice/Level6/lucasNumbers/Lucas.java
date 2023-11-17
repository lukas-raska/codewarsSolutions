package codewars.practice.Level6.lucasNumbers;

public class Lucas {

    public static void main(String[] args) {
        int number = -10;
        System.out.println(lucasNum(number));
    }

    public static int lucasNum (int n){

        if (n == 0){
            return 2;
        }
        if (n==1){
            return 1;
        }
        if (n<0){
            return lucasNum(n+2)-lucasNum(n+1);
        }
        return lucasNum(n-1) + lucasNum(n-2);
    }
}
