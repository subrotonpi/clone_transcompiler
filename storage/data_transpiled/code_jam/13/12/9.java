public static int run ( ) {
  int E = Integer . parseInt ( readLine ( ) ) ;
  int R = Integer . parseInt ( readLine ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int [ ] v = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    v [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  int [ ] [ ] F = new int [ 2 ] [ ] ;
  F [ 0 ] [ 0 ] = 0 ;
  F [ 0 ] [ 1 ] = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int l = F . length ;
    F [ l - 1 ] [ 1 ] = F [ l - 1 ] [ 1 ] + F [ l - 1 ] [ 0 ] * v [ i ] ;
    for ( int j = l - 2 ;
    j >= 0 ;
    j -- ) {
      F [ j ] [ 1 ] = Math . max ( F [ j ] [ 1 ] + F [ j ] [ 0 ] * v [ i ] , F [ j + 1 ] [ 1 ] ) ;
    }
    for ( int j = 0 ;
    j <= l ;
    j ++ ) {
      F [ j ] [ 1 ] -= F [ j ] [ 0 ] * v [ i ] ;
      F [ j ] [ 0 ] += R ;
    }
    F = new int [ l ] [ ] ;
    for ( int j = 0 ;
    j <= l ;
    j ++ ) {
      if ( F [ j ] [ 0 ] < E ) {
        G [ j ] = F [ j ] ;
      }
      else {
        G [ j ] = new int [ ] {
          E , ( - F [ j - 1 ] [ 0 ] * F [ j ] [ 1 ] + E * F [ j ] [ 1 ] - E * F [ j - 1 ] [ 1 ] + F [ j ] [ 0 ] * F [ j - 1 ] [ 1 ] ) / ( F [ j ] [ 0 ] - F [ j - 1 ] [ 0 ] ) }
          ;
          break ;
        }
      }
      F = G ;
    }
    return F [ 0 ] [ 1 ] ;
  }
  