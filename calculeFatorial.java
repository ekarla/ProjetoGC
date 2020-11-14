import java.util.Scanner;

public class calculeFatorial{
  public static void main(String[] args) {
    int num;
    int fatorial = 1;
    Scanner leitor= new Scanner(System.in);
    num = leitor.nextInt();
    for (int i = 1;i <= num ; i ++ ) {
      fatorial *= i;

      
    }
    
    System.out.println("Fatorial eh: " +fatorial);
  }
}
