package Assignment6;

public class Pattern9 {
    public static void main(String[] args)
    {

        for(int i = 1 ; i<= 5 ; i++)
        {
            char k = 'A' ;
            k = (char) ('A' -1+i);
            for(int j = 1 ;j<= 5; j++)
            {

                if(j>=i)
                {
                    System.out.print(k++);
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
