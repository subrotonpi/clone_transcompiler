public static int [ ] [ ] compute ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int inf = 10 * 20 ;
  int [ ] [ ] table = new int [ N + 2 ] [ N + 2 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( P [ i - 1 ] > 0 ) table [ i ] [ N + 1 ] = P [ i - 1 ] ;
    else table [ 0 ] [ i ] = - P [ i - 1 ] ;
    for ( int j = 2 * i ;
    j <= N ;
    j += i ) table [ i ] [ j ] = inf ;
  }
  int [ ] [ ] fk = new int [ N + 2 ] [ N + 1 ] ;
  int df ;
  boolean [ ] visit = new boolean [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    visit [ i ] = true ;
    if ( i == N ) return table [ i ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      df = fk [ j ] ;
      if ( table [ j ] [ j ] > 0 ) {
        df = table [ j ] [ j ] ;
        return df ;
      }
    }
  }
  ans = 0 ;
  while ( true ) {
    visit = new boolean [ N + 2 ] ;
    df = fk [ 0 ] [ N + 1 ] ;
    if ( df > 0 ) ans += df ;
    else break ;
  }
  int num = sum ( P ) ;
  System . out . println ( num - ans ) ;
  return ans ;
}
