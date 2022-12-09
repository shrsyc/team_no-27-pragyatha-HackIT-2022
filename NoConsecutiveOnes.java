class NoConsecutiveOnes
{
    public static void countStrings(int n, String bits, int lastDigit)
    {
        if (n == 0){System.out.println(bits); return;}
        countStrings(n - 1, bits + '0', 0);
        if (lastDigit == 0)countStrings(n - 1, bits + '1', 1);
        
    }
 
    public static void main(String[] args)
    {
        int n = 5;
        String bits = "";
        countStrings(n, bits, 0);
    }
}