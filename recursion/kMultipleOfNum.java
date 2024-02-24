package lib.recursion;

public class kMultipleOfNum {
    public static void main(String[] args) {
        int num=12;
        int k=5;
        ans(num,k);
    }
    public static void ans(int num,int k){
        if(k==0) return;
        else{
            ans(num,k-1);
            System.out.println(num*k);
            
        }
    } 
}
