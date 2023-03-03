private static void solve ( int b , int m ) {
  if ( m > 2 * ( b - 2 ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
    return ;
  }
  System . out . println ( "POSSIBLE" ) ;
  if ( m == 2 * ( b - 2 ) ) {
    System . out . println ( "0" + "1" * ( b - 1 ) ) ;
  }
  else {
    List < Integer > l = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < b - 2 ;
    i ++ ) {
      l . add ( ( m >> i ) & 1 ) ;
    }
    System . out . println ( "0" + Arrays . toString ( l . toArray ( ) ) + "0" ) ;
  }
  for ( int i = 1 ;
  i < b ;
  i ++ ) {
    System . out . println ( "0" + Arrays . toString ( l . toArray ( ) ) + "1" ) ;
  }
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    m = Integer . parseInt ( input . nextLine ( ) ) ;
    solve ( b , m ) ;
  }
}
