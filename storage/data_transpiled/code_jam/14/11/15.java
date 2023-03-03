static final int countBit ( int x ) {
  return x == 0 ? 0 : ( x & 1 ) + countBit ( x >>> 1 ) ;
  /* Convert to a string */
  char [ ] trans = new char [ 32 ] ;
  int TT = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int T = 1 ;
  T <= TT ;
  T ++ ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int L = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    char [ ] A = new char [ N ] ;
    char [ ] B = new char [ N ] ;
    int ans = L + 1 ;
    for ( int m : xrange ( 1 << L ) ) {
      int cnt = countBit ( m ) ;
      if ( cnt >= ans ) continue ;
      char [ ] A2 = new char [ N ] ;
      for ( int s = 0 ;
      s < A . length ;
      s ++ ) A2 [ s ] = trans [ s ] ;
      if ( new BitSet ( A2 ) . equals ( new BitSet ( B ) ) ) ans = cnt ;
    }
    String anss = ans == L + 1 ? "NOT POSSIBLE" : String . valueOf ( ans ) ;
    System . out . println ( "Case #" + T + ": " + anss ) ;
  }
  return T ;
}
