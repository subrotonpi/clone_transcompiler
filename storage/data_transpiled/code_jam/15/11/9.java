public static void main ( String input ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    int n = Integer . parseInt ( input ) ;
    int [ ] m = new int [ n ] ;
    for ( int i = 0 ;
    i < m . length ;
    i ++ ) {
      m [ i ] = Integer . parseInt ( input ) ;
    }
    int x = 0 , y = 0 , t = 0 , r = 0 ;
    for ( int d : m ) {
      if ( d < t ) {
        x += t - d ;
        r = Math . max ( r , t - d ) ;
      }
      t = d ;
    }
    for ( int d = m . length - 1 ;
    d >= 0 ;
    d -- ) {
      y += Math . min ( r , m [ d ] ) ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + x + " " + y ) ;
  }
}
