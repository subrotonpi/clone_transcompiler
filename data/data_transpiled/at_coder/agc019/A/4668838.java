public static void print ( int q , int h , int s , int d ) {
  int o = Math . min ( q * 4 , h * 2 , s ) ;
  int t = Math . min ( o * 2 , d ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  System . out . println ( n / 2 * t + n % 2 * o ) ;
}
