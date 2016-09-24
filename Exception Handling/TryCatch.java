import java.util.*;

public class TryCatch {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
   int x = sc.nextInt();
   int y = sc.nextInt();
   System.out.println(x / y);
 } catch (Exception e) {
   if (e instanceof InputMismatchException)
    System.out.println("java.util.InputMismatchException");
  else System.out.println(e);
}

sc.close();
}

}