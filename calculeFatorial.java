import java.util.Scanner;

public class calculeFatorial{
  public static void main(String[] args) {
    int num = 3;
    int fatorial = 1;
    
    for (int i = 1;i <= num ; i ++ ) {
      fatorial *= i;

      
    }
    
    System.out.println("Fatorial eh: " +fatorial);
  }
}
