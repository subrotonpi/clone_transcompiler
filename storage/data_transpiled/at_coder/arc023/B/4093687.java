public static int bUnknownX ( int R , int C , int D , int [ ] [ ] Grid ) {
  int ans = 0 ;
  int parity = D % 2 ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) for ( int c = 0 ;
  c < C ;
  c ++ ) if ( ( r + c ) <= D && ( r + c ) % 2 == parity ) ans = Math . max ( ans , Grid [ r ] [ c ] ) ;
  return ans ;
}
