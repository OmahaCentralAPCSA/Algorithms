public class Algos{

  public static void main(String[] args) {
  
      System.out.println(gcd(3954, 134));
  }
  
  public static int gcd(int a, int b) {

      while(a != 0 && b != 0) {
        //swap b into the place of a. 
        int temp = b; 
        b = a % b; //remainder of a / b 
        a = temp; 
        System.out.println("A: " + a + "B: " + b); 
      }
      //either a or b is 0 since our while loop stopped. 
      if( a == 0) {
          return b; 
      } else { //b == 0
          return a; 
      }
  }
  
  public static void perfectNumbers() {
  
      //print out the first 4 perfect numbers
    //perfNumCount -> keep track of my perfect numbers
    

    //repeat until perfNumCount == 4:
      // num -> the number I want to check.  
      //temp -> one less than num
      
      // sum -> 0 // will be the sum of all the divisors (temp) 

        // temp = num - 1
        // repeat while temp is greater than 1. 
        //    if number % temp == 0 
        //        add temp to sum 
        //    decrease temp by 1. 
        // if num == sum
        //    num is a perfect number
        //    print number
      //increase num






  }
  
  public static void mersennePrimes() {
  
    //print out the first 6 mersenne primes and their corresponding perfect numbers.
  }


}
