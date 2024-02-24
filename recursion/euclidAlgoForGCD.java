package lib.recursion;

public class euclidAlgoForGCD {
    public static void main(String[] args) {
        int x=9;
        int y=15;
        int ans=gcd(y,x);
        System.out.println(ans);
    }
    public static int gcd(int x,int y){
        if(y==0) return x;
        else{
            return gcd(y,x%y);
        }
    }
}
