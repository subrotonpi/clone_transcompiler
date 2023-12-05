public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    R [ i ] = R [ i ] ;
  }
  Arrays . sort ( R ) ;
  R = R . clone ( ) ;
  R = R . clone ( ) ;
  int ans = 0 ;
  for ( int r : R ) {
    ans = ( ans + r ) / 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
