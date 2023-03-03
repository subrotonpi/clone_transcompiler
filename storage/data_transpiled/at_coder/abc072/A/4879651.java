public static int [ ] [ ] x ( int [ ] t ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    ans += input [ i ] [ 0 ] - t [ i ] [ 1 ] ;
  }
  int [ ] [ ] ans = x ( t ) ;
  if ( ans > 0 ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return ans ;
}
