private static int S = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int state = 0 ;
  state < 1 << S . length - 1 ;
  state ++ ) {
    ans += new Integer ( S [ 0 ] + '' + ( ( state >> i & 1 ) ? '+' : '' ) + S [ state ] ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
