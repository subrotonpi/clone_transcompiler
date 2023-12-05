public static void solve ( ) {
  for ( int cas : xrange ( 1 , 1 + input ) ) {
    int b = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) , n = n -- > 0 ? 1 : 0 ;
    int [ ] m = new int [ b ] ;
    for ( int i = 0 ;
    i < b ;
    i ++ ) m [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    {
      int s = 0 ;
      for ( int j : xrange ( b ) ) s += ( T + m [ j ] - 1 ) / m [ j ] ;
      return ;
    }
    int L = 0 ;
    int R = 10 * 50 ;
    while ( R - L > 1 ) {
      int M = L + R >> 1 ;
      int fM = M ;
      if ( fM > n ) R = M ;
      else L = M ;
    }
    int [ ] dist = new int [ b ] ;
    for ( int i : xrange ( b ) ) {
      int ct = ( L + m [ i ] - 1 ) / m [ i ] ;
      dist [ i ] = ct * m [ i ] ;
      n -= ct ;
    }
    assert 0 <= n && n < b ;
    int [ ] idxs = new int [ b ] ;
    for ( int i = 0 ;
    i < b ;
    i ++ ) idxs [ i ] = i ;
    System . out . println ( "Case #" + cas + ": " + ( idxs [ n ] + 1 ) ) ;
  }
}
