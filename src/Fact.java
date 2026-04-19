
public class Fact {
    public static void main(String[] args){
        System.out.println(Factorial(5));

    }
    static int Factorial(int n){
        if(n<=1){
            return 1;
        }
        int fact=n*Factorial(n-1);
        return fact;
    }
}
