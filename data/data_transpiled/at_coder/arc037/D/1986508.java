public static void M ( int M ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 1 ;
  int b1 = 1 ;
  int b2 = 1 ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    int b = b1 + b2 ;
    int d = b * b - b1 * b1 ;
    a = ( 3 * a + b * b * b ) % M ;
    b1 = ( b1 * d ) % M ;
    b2 = ( b * b + b2 * d ) % M ;
  }
  System . out . println ( a ) ;
}
