public static void print ( int n , int m ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = n % 12 * 30 + m / 2 ;
  m = m * 6 ;
  int a = m - n ;
  if ( Math . abs ( a ) < 180 ) {
    System . out . println ( Math . abs ( a ) ) ;
  }
  else {
    System . out . println ( 360 - Math . abs ( a ) ) ;
  }
}
