package Assignment1;

public class Pattern10 {
    public static void main(String[] args)
    {

        for(int i = 1 ; i<= 15 ; i++)
        {
            for(int j = 1 ;j<= 15; j++)
            {

                if(i==1||i==15||j==1||j==15)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
