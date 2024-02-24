package lib.recursion;

public class sumWithAlternativeSign {
    public static void main(String[] args) {
        int n=10;
        System.out.println(ans(n)); //1-2+3-4+5-6+7-8+9-10
    }
    public static int ans(int n){
        if(n==0) return n;
        else{
            if(n%2==0) return ans(n-1)-n;
            else return ans(n-1)+n;
        }
    }
}
