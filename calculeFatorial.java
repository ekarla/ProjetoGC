import java.util.Scanner;

public class calculeFatorial{

 public static int fat(int num){
      int fatorial = 1;
      for (int i = 1;i <= num ; i ++ ) {
      fatorial *= i;

      
    }
    
    return fatorial;
 }
  public static void main(String[] args) {
    int num = 3;
    
    int fatNum = fat(num);
    
    
    System.out.println("Fatorial eh: " + fatNum);
  }
}
