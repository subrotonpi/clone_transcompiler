static final String chasingChicks ( int N , int K , int B , int T , int [ ] Xs , int [ ] Vs ) {
  boolean [ ] possible = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Xs [ i ] ;
    int v = Vs [ i ] ;
    float t = ( float ) ( B - x ) / v ;
    if ( t <= T ) possible [ i ] = true ;
    else possible [ i ] = false ;
  }
  if ( Stream . of ( possible ) . filter ( x -> x != T ) . count ( ) < K ) return "IMPOSSIBLE" ;
  int [ ] [ ] inters = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) inters [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( Vs [ i ] == Vs [ j ] ) inters [ i ] [ j ] = - 1 ;
      else if ( Xs [ i ] <= Xs [ j ] ) inters [ i ] [ j ] = - ( float ) ( ( Xs [ i ] - Xs [ j ] ) / ( float ) ( ( Vs [ i ] - Vs [ j ] ) ) ) ;
    }
  }
  int [ ] costs = new int [ N ] ;
  Arrays . fill ( costs , 0 ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( ! possible [ j ] ) costs [ j ] = 9999999999999999999999999999999 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( inters [ i ] [ j ] >= 0.0 && inters [ i ] [ j ] < T ) {
        if ( ! possible [ j ] ) costs [ i ] ++ ;
      }
    }
  }
  Arrays . sort ( costs ) ;
  return Arrays . toString ( costs ) ;
}
