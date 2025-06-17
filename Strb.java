public class Strb {
  public static void main(String[] args) {
      StringBuilder sb =new StringBuilder("tony");

      sb.charAt(0);
      System.out.println(sb);

      sb.setCharAt(0,'p');
      System.out.println(sb);

      sb.insert(3,"t");
      System.out.println(sb);
  }

}
