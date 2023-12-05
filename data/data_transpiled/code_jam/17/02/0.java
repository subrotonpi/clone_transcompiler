public static int toInteger ( List < Integer > l ) {
  int out = 0 ;
  for ( Integer d : l ) {
    out = out * 10 + d ;
  }
  return out ;
  /* Test case */
  int [ ] n = Integer . parseInt ( input ) ;
  int len = n . length ;
  assert len >= 1 ;
  int start = 0 ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    if ( n [ i ] < n [ start ] ) break ;
    else if ( n [ i ] > n [ start ] ) start = i ;
  }
  /* Test case */
  for ( int j = start + 1 ;
  j < len ;
  j ++ ) n [ j ] = 0 ;
  /* Test case */
  for ( int i = 1 ;
  i <= n . length ;
  i ++ ) System . out . println ( "Case #" + i + ": " + runTest ( i ) ) ;
  return n [ i - 1 ] ;
}
