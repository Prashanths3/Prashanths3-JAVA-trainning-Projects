public class Calculator {
    public Calculator() {
    
  }
  
  public static int add(int a, int b) {
    return(a+b);
  }
  
  public static int subtract(int a, int b) {
    return(a-b);
  }
  
  public static int multiply(int a, int b) {
    return(a*b);
  }
  
  /*public static int divide(int a, int b) {
    if(b!=0){
      return(a/b);
    } else {
      System.out.println("Re-entry(Correct)!");
      return(0);
    }
  }*/
  public static double divide(double a, double b) {
      return(a/b);
  }//later assign int parameters insted of double
  
  /*public static int modulo(int a, int b) {
    if(b == 0) {
      System.out.println("Re-entry(Think & type)!");
      return(0);
    } else {
      return(a%b);
    }
  }*/
  public static double modulo(double a, double b) {
      return(a%b);
  }//later assign int parameters insted of double
  
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println("add res= "+add(5,7));
    System.out.println("sub res= "+subtract(45,11));
    System.out.println("mul res= "+multiply(9,7));
    System.out.println("div res= "+divide(1111,111));
    System.out.println("mod res= "+modulo(99,10));
  }
  
}