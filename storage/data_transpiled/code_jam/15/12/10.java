public static void main ( String input ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    int b = Integer . parseInt ( input . substring ( 0 , input . indexOf ( " " ) ) ) , n = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 , input . indexOf ( " " ) ) ) ;
    int [ ] m = new int [ input . length ] ;
    for ( int i = 0 ;
    i < m . length ;
    i ++ ) m [ i ] = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 , input . indexOf ( " " ) ) ) ;
    int l = - 1 , r = 10 * 18 ;
    while ( l + 1 < r ) {
      int x = l + r + 1 >>> 1 ;
      if ( Integer . bitCount ( x ) + b >= n ) r = x ;
      else l = x ;
    }
    int [ ] [ ] e = new int [ b ] [ ] ;
    for ( int j = 0 ;
    j < b ;
    j ++ ) {
      e [ j ] = new int [ ] {
        - ( r % m [ j ] ) , j }
        ;
        n -= r / m [ j ] ;
      }
      Arrays . sort ( e ) ;
      System . out . println ( "Case #" + ( tc + 1 ) + ": " + ( 1 + e [ n - 1 ] [ 1 ] ) ) ;
    }
  }
  