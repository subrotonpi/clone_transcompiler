private static int solve ( int ap , int bp , Pair < Integer , Integer > A , Pair < Integer , Integer > B ) {
  int ans ;
  int ap_ ;
  int bp_ ;
  int ap_ ;
  int ap_ ;
  int ap_ ;
  int ap_ ;
  int bp_ ;
  int bp_ ;
  int [ ] Atop = A . getLeft ( ) ;
  Btop = B . getLeft ( ) ;
  if ( Atop [ 1 ] == Btop [ 1 ] ) {
    packed = Math . min ( Atop [ 0 ] , Btop [ 0 ] ) ;
    ap_ = ap + packed ;
    bp_ = bp + packed ;
    A_ = ( ( Atop [ 0 ] - packed ) < 0 ? Atop [ 1 ] : 0 ) ;
    B_ = ( ( Btop [ 0 ] - packed ) < 0 ? Btop [ 1 ] : 0 ) ;
    ans = packed + solve ( ap_ , bp_ , A_ , B_ ) ;
    memo . put ( ap , bp , ans ) ;
    return ans ;
  }
  else {
    ap_ = ap + Atop [ 0 ] ;
    A_ = A . getRight ( ) ;
    ans = solve ( ap_ , bp , A_ , B ) ;
    bp_ = bp + Btop [ 0 ] ;
    B_ = B . getRight ( ) ;
    ans = max ( discA , discB ) ;
    memo . put ( ap , bp , ans ) ;
    return ans ;
  }
}
