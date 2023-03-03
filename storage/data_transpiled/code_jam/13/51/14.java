static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
{
  int ans = - loss ;
  int outcome = Math . min ( my [ i ] + X [ i ] , X [ i ] ) ;
  int [ ] pos = new int [ 37 ] ;
  for ( int i = 0 ;
  i < pos . length ;
  i ++ ) {
    if ( my [ i ] + X [ i ] == outcome ) {
      ans += my [ i ] * 36 / N ;
    }
  }
  return ans ;
}
