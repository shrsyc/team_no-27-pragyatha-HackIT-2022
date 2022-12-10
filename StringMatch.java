import java.util.Arrays;
public class StringMatch{
    static boolean getMatch(String string, String pattern,int n, int m)
    {
        if (m == 0)return (n == 0);
 
        boolean[][] helperArray = new boolean[n + 1][m + 1];
 
        for (int i = 0; i < n + 1; i++)Arrays.fill(helperArray[i], false);
 
        helperArray[0][0] = true;
  
        for (int j = 1; j <= m; j++)if (pattern.charAt(j - 1) == '*')helperArray[0][j] = helperArray[0][j - 1];
 
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (pattern.charAt(j - 1) == '*')helperArray[i][j] = helperArray[i][j - 1]|| helperArray[i - 1][j];
                else if (pattern.charAt(j - 1) == '?'|| string.charAt(i - 1)== pattern.charAt(j - 1))
                            helperArray[i][j] = helperArray[i - 1][j - 1];
                else helperArray[i][j] = false;
            }
        }
 
        return helperArray[n][m];
    }
    public static void main(String args[])
    {
        String string = "xyxzzzxy",pattern = "x***x";

        if (getMatch(string, pattern, string.length(),pattern.length()))System.out.println("Match");
        else System.out.println("No Match");
    }
}