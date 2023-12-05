public static int compute ( int [ ] R , int [ ] [ ] Q ) {
  int N = R . length , P = Q [ 0 ] . length ;
  for ( int [ ] q : Q ) {
    Arrays . sort ( q ) ;
  }
  int [ ] [ ] m = new int [ N ] [ N ] ;
  int [ ] [ ] M = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < P ;
    j ++ ) {
      m [ i ] [ j ] = ( 10 * Q [ i ] [ j ] + 11 * R [ i ] - 1 ) / ( 11 * R [ i ] ) ;
      M [ i ] [ j ] = ( 10 * Q [ i ] [ j ] ) / ( 9 * R [ i ] ) ;
    }
  }
  int [ ] I = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    I [ i ] = 0 ;
  }
  int count = 0 ;
  while ( ! I [ P ] ) {
    int least = Math . max ( m [ N ] [ I [ P ] ] , M [ N ] [ P ] ) ;
    int most = Math . min ( M [ N ] [ I [ P ] ] , M [ N ] [ P ] ) ;
    if ( least <= most ) {
      count ++ ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        I [ k ] ++ ;
      }
    }
    else {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        while ( I [ k ] < P && M [ k ] [ I [ k ] ] < least ) {
          I [ k ] ++ ;
        }
      }
    }
  }
  return count ;
}
int T = Integer . parseInt ( input ( ) ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  N = R . length ;
  P = P ;
  R = R [ N ] ;
  Q = Q [ 0 ] ;
  count = compute ( R , Q ) ;
  System . out . println ( "Case #" + t + ":" + count ) ;
}
