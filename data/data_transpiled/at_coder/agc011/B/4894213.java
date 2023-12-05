public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int c = 0 , d = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    c += 2 * a [ i ] ;
    if ( c < a [ i + 1 ] ) {
      d = i + 1 ;
    }
  }
  System . out . println ( n - d ) ;
}
