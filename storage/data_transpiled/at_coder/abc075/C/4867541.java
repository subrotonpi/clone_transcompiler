public static int root ( int x ) {
  if ( uf [ x ] == x ) {
    return x ;
  }
  uf [ x ] = root ( uf [ x ] ) ;
  return uf [ x ] ;
}
/* same */
{
  int rx = root ( x ) ;
  int ry = root ( y ) ;
  if ( rx == ry ) {
    return 0 ;
  }
  uf [ rx ] = ry ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] edge = new int [ M ] [ N + 1 ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  uf [ i ] = i ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    if ( i != j ) {
      unite ( edge [ j ] [ 0 ] , edge [ j ] [ 1 ] ) ;
    }
  }
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( ! same ( ++ i , j + 1 ) ) {
      cnt ++ ;
      break ;
    }
  }
}
System . out . println ( String . valueOf ( cnt ) ) ;
}
