public static int n ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int [ ] a = new int [ 50 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  int [ ] cnt = new int [ 50 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) for ( int j = 0 ;
  j < 50 ;
  j ++ ) {
    if ( ( a [ i ] & ( 1 << j ) ) == 0 ) cnt [ j ] += 1 << j ;
    else cnt [ j ] -= 1 << j ;
  }
  int [ ] [ ] gg = new int [ 50 ] [ 50 ] ;
  for ( int i = 0 ;
  i < gg . length ;
  i ++ ) gg [ i ] [ 0 ] = cnt [ i ] ;
  Arrays . sort ( gg ) ;
  int ans = 0 ;
  for ( int [ ] i : gg ) {
    if ( i [ 0 ] < 0 ) break ;
    if ( ( 1 << i [ 1 ] ) <= k ) {
      k -= 1 << i [ 1 ] ;
      ans += i [ 0 ] ;
    }
  }
  System . out . println ( ans + Arrays . toString ( a ) ) ;
  return ans ;
}
