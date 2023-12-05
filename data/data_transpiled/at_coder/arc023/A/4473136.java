public static void ans ( ) {
  int y = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  if ( ( m == 1 ) || ( m == 2 ) ) {
    m += 12 ;
    y -- ;
  }
  int a = 735369 ;
  int b = 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429 ;
  System . out . println ( a - b ) ;
}
