class Primo {
    public static void main(String args[]) {
        int i;
        int k;

        for(i = 1; i <= 10; i++)
        {
            int counter = 0;
            for(k = 1; k <= i; k++)
            {
                if( (i % k) == 0)
                    ++counter;  
            }
            if( counter == 2 )
                System.out.println("Numero " + i + " eh primo");
        }
    }
}

