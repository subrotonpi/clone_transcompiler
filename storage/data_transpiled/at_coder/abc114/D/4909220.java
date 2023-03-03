public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] expNum = new int [ n + 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    int cur = i ;
    for ( int j = 2 ;
    j <= i ;
    j ++ ) {
      while ( cur % j == 0 ) {
        expNum [ j ] ++ ;
        cur /= j ;
      }
    }
  }
  {
    int num = Integer . parseInt ( input . nextLine ( ) ) ;
    int total = ( Integer . parseInt ( expNum [ 0 ] ) + expNum [ 1 ] ) / 2 ;
    System . out . println ( total ) ;
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    new Main ( ) . run ( ) ;
  }
}
