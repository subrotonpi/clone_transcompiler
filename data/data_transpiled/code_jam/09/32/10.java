public static void solve ( int ii ) {
  for ( ii = 1 ;
  ii <= Integer . parseInt ( readLine ( ) ) ;
  ii ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] f = new int [ N ] [ N ] ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) f [ a ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) f [ j ] [ j ] = Integer . parseInt ( readLine ( ) ) ;
    int [ ] g = new int [ 6 ] ;
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) g [ i ] = sum ( f [ i ] ) ;
    float [ ] x = g . clone ( ) ;
    float [ ] d = g . clone ( ) ;
    float t = 0 ;
    if ( ( d != {
      0 , 0 , 0 }
      ) && ( sum ( x ) * d [ i ] ) < 0 ) {
        t = - ( 0.0 + sum ( x ) * d [ i ] ) / sum ( d ) ;
      }
      x = new float [ 3 ] ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) x [ i ] = ( float ) ( x [ i ] + t * d [ i ] ) / N ;
      x = ( x [ 0 ] * x [ 0 ] + x [ 1 ] * x [ 1 ] + x [ 2 ] * x [ 2 ] ) * 0.5 ;
      System . out . println ( "Case #" + ii + ": " + x + " " + t ) ;
    }
  }
  