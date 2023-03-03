public static int running ( @ Nonnegative int N , int M , @ Nonnegative int [ ] [ ] queries ) {
  int PHI = 0 ;
  int [ ] [ ] g = new int [ N ] [ N ] ;
  for ( int u = 0 ;
  u < N ;
  u ++ ) {
    int v = queries [ u ] [ u ] ;
    g [ u - 1 ] [ v - 1 ] = 1 ;
    g [ v - 1 ] [ u - 1 ] = - 1 ;
  }
  int [ ] dp = new int [ 1 << N ] ;
  dp [ PHI ] = 1 ;
  for ( int S = 1 ;
  S < 1 << N ;
  S ++ ) {
    for ( int v = 0 ;
    v < N ;
    v ++ ) {
      if ( ( S & ( 1 << v ) ) == 0 ) {
        continue ;
      }
      int S_v = S & ~ ( 1 << v ) ;
      if ( ArrayUtils . contains ( g , S_v & ( 1 << k ) ) && g [ k ] [ v ] == - 1 ) {
        continue ;
      }
      dp [ S ] += dp [ S_v ] ;
    }
  }
  return dp [ ( 1 << N ) - 1 ] ;
}
if ( getClass ( ) . equals ( String . class ) ) {
  M = 0 ;
  N = Integer . parseInt ( input ( ) ) ;
}
else {
  queries = Arrays . asList ( input ( ) . split ( " " ) ) ;
}
int ans = running ( N , M , queries ) ;
System . out . println ( ans ) ;
return ans ;
}
