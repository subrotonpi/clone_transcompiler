public static int [ ] getN ( ) {
  int [ ] C = new int [ N ] , S = new int [ N ] , F = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int Ci = Integer . parseInt ( input . nextLine ( ) ) ;
    int Si = Integer . parseInt ( input . nextLine ( ) ) ;
    int Fi = Integer . parseInt ( input . nextLine ( ) ) ;
    C [ i ] = Ci ;
    S [ i ] = Si ;
    F [ i ] = Fi ;
  }
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      if ( t [ i ] % F [ j ] == 0 && t [ i ] >= S [ j ] ) t [ i ] += C [ j ] ;
      else if ( t [ i ] < S [ j ] ) t [ i ] = S [ j ] + C [ j ] ;
      else if ( t [ i ] >= S [ j ] ) t [ i ] = ( ( t [ i ] - S [ j ] ) / F [ j ] + 1 ) * F [ j ] + S [ j ] + C [ j ] ;
    }
  }
  System . out . println ( t [ i ] ) ;
  return t ;
}
