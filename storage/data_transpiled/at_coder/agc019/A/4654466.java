public static int q ( int q , int h , int s , int d ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int one = Math . min ( 4 * q , 2 * h , s ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( Math . min ( d * ( n / 2 ) , n * one ) ) ;
  }
  else {
    System . out . println ( Math . min ( d * ( n / 2 ) + one , n * one ) ) ;
  }
  return n ;
}
