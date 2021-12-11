public class Primenumber {
    public static void main(String[] args) {
        int num=15;
        boolean isPrime=true;
        for (int i=2;i<num;i++)
        {
        if(num%2==0)
        {
           isPrime=false;
           break;
        }
        }
        if (isPrime)
        {
            System.out.println(num+"is a prime number");
        }
        else
        {
            System.out.println(num+"Not a prime number");
        }
    }
}
