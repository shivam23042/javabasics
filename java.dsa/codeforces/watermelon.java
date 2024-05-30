public class watermelon{
    public static void main(String[] args) {
        int a =121;
        int rev = 0;

        for( ; a > 0; a /= 10){
            int rem = a % 10;
            rev = rev * 10 + rem;
            System.out.println(rev);
        }
       System.out.println(rev);
        
    }
}