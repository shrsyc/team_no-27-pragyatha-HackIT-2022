public class IslandJumpAlive {
    static double getProbability(int m, int n,int x, int y,int steps)
    {
        if (x<0 || y<0 || x>=m || y>=n)return 0.0;
        if (steps == 0)return 1.0;
        
        double probability = 0.0;
    
        probability += getProbability(m , n , x - 1, y , steps - 1) * 0.25;
        probability += getProbability(m , n , x , y + 1 , steps - 1) * 0.25;
        probability += getProbability(m , n , x + 1 , y , steps - 1) * 0.25;
        probability += getProbability(m , n , x , y - 1 , steps - 1) * 0.25;
    
        return probability;
    }
    public static void main (String[] args)
    {
        int m = 2, n = 2;
        int i = 0, j = 0;
        int steps = 1;
    
        System.out.println("Probability is " +getProbability(m , n , i , j , steps));
    
    }
 
}