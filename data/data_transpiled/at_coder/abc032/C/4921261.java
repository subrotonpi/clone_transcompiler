public static int sequence ( int N , int K , @ Nonnull int [ ] S ) {
  S [ 0 ] += K + 1 ;
  if ( 0 == S [ 0 ] ) return N ;
  int maxlen = 0 ;
  int l = 0 , r = 0 ;
  int t = 1 ;
  while ( r < N ) {
    while ( t * S [ r ] <= K ) {
      t *= S [ r ] ;
      r ++ ;
    }
    maxlen = Math . max ( maxlen , r - l ) ;
    if ( l < r ) {
      t /= S [ l ] ;
      l ++ ;
    }
    else {
      l = l + 1 ;
      r = r + 1 ;
    }
  }
  return maxlen ;
}
if ( getClass ( ) . isEnum ( ) ) {
  N = 0 ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = sequence ( N , K , S ) ;
  System . out . println ( ans ) ;
}
