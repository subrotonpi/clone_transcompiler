public static int tcs = Integer . parseInt ( input ) {
  int [ ] [ ] binom = new int [ 5001 ] [ 5001 ] ;
  for ( int i = 1 ;
  i < binom . length ;
  i ++ ) {
    binom [ i ] = new int [ i ] ;
    binom [ i ] [ i ] = binom [ i - 2 ] [ 0 ] / 2 ;
    for ( int j = 1 ;
    j < i ;
    j ++ ) binom [ i ] [ j ] = ( binom [ i - 2 ] [ j - 1 ] + binom [ i - 2 ] [ j ] ) / 2 ;
    binom [ i ] [ j ] = binom [ i ] [ j - 1 ] / 2 ;
  }
  for ( int i = 0 ;
  i < binom . length ;
  i ++ ) {
    assert ( binom [ i ] . length == i + 1 ) ;
    for ( int j = 1 ;
    j < binom [ i ] . length ;
    j ++ ) binom [ i ] [ j ] += binom [ i ] [ j - 1 ] ;
  }
  for ( int tc = 1 ;
  tc <= tcs ;
  tc ++ ) {
    int n = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int x = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int y = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int level = ( Math . abs ( x ) + y ) / 2 ;
    int l = 0 ;
    while ( n > 0 ) {
      int k = 4 * l + 1 ;
      if ( n >= k ) {
        if ( level == l ) {
          System . out . println ( "Case #" + tc + ": 1.0" ) ;
          break ;
        }
        n -= k ;
      }
      else {
        if ( level == l ) {
          if ( y <= n - 1 - 2 * l ) System . out . println ( "Case #" + tc + ": 1.0" ) ;
          else if ( y >= Math . min ( 2 * l , n ) ) System . out . println ( "Case #" + tc + ": 0.0" ) ;
        }
        else System . out . println ( "Case #" + tc + ": " + ( 1 - binom [ n ] [ y ] ) + "15f" ) ;
        break ;
      }
      n = 0 ;
    }
    l ++ ;
  }
  return tc ;
}
