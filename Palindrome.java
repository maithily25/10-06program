
/*import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the word:");
    String str=sc.next();
    String reversed=new StringBuilder(str).reverse().toString();
    if(str.equals(reversed)){
      System.out.println(str+ " is a palindrome");
    }
    else{
      System.out.println(str+ " is not a palindrome");
    }
    sc.close();
  }
}*/

public class Palindrome{
  public static void main(String[] args) {
      String str="madam";
      String_reversed str=" ";
      for(int i=str.length()-1;i>=0;i--){
        reversed_str=str;
      }
      if(str.equals(reversed str)){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not palindrome");
      }
  }
}

