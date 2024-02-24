package lib.recursion;

public class pPowerq {
    public static void main(String[] args) {
        int p=5;
        int q=3;
        int ans=power(p,q);
        System.out.println(ans);
    }
    public static int power(int p,int q){
        if(q==0) return 1;
        else{
            return p*power(p,q-1);
        }
    }
}
