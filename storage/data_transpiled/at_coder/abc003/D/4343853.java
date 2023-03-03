@ functools . lru_cache ( maxsize = 100 ) public static int [ ] getBigIntegerArray ( int i , int j ) {
  int div = ( int ) ( 1e9 + 7 ) ;
  @ SuppressWarnings ( "unused" ) int [ ] pi = new int [ s + 1 ] ;
  int [ ] iCj = new int [ s + 1 ] ;
  for ( int ii = i + 1 ;
  ii < s ;
  ii ++ ) {
    if ( ii == 0 ) {
      pi [ 0 ] = 1 ;
    }
    else {
      int [ ] pii = new int [ pi . length ] ;
      for ( int jj = 0 ;
      jj < s + 1 ;
      jj ++ ) {
        pii [ jj ] += jj != 0 ? pi [ jj - 1 ] : 0 ;
        if ( pii [ jj ] == 0 ) {
          break ;
        }
        else if ( pii [ jj ] >= div ) {
          pii [ jj ] -= div ;
        }
      }
      pi = pii ;
    }
  }
  @ SuppressWarnings ( "unused" ) int [ ] numdl = new int [ s + 1 ] ;
  int num ;
  int r = 0 ;
  int c = 0 ;
  for ( int n = 0 ;
  n < s ;
  n ++ ) {
    if ( n * y == d + l ) num = iCj [ n * y ] ;
    else {
      num = numdl [ n * y ] ;
      num -= numdl [ n * ( y - 1 ) ] ;
      num -= 2 ;
      num -= numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 2 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 2 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += 4 ;
      num -= numdl [ ( x - 2 ) * y ] ;
      num -= numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 2 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
      num += numdl [ ( x - 1 ) * y ] ;
    }
  }
  return pi ;
}
