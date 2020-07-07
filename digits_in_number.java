// Number of digits in a number in 0(1) time and space complexity

import java.util.*;
import java.lang.*;
class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    System.out.print ("Enter the number : ");
    int n = in.nextInt ();
    double ans = 1 + Math.floor (Math.log (n) / Math.log (10));
    int intANS = (int) (ans);
    System.out.println ("No. of digits in " + n + " = " + intANS);
  }
}

// Contributed by GVP
