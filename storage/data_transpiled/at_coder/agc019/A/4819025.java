public static void print ( int q , int h , int s , int d ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int a = Math . min ( Math . min ( q * 4 , h * 2 ) , s ) ;
  int b = Math . min ( a * 2 , d ) ;
  System . out . println ( n / 2 * b + n % 2 * a ) ;
}
