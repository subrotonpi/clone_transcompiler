public static int [ ] [ ] G ( int N , int G , int E ) {
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] itta = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    itta [ i ] = 0 ;
  }
  itta [ 0 ] = 1 ;
  /* dfs */
  for ( int j = 0 ;
  j < gr [ i ] . length ;
  j ++ ) {
    if ( gr [ i ] [ j ] == - 1 ) {
      -- gr [ i ] [ j ] ;
      return - 1 ;
    }
    if ( itta [ gr [ i ] [ j ] ] == 0 ) {
      itta [ gr [ i ] [ j ] ] = 1 ;
      if ( dfs ( gr , gr [ i ] [ j ] ) == - 1 ) {
        -- gr [ i ] [ j ] ;
        return - 1 ;
      }
    }
  }
  int [ ] gr = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) gr [ i ] = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    gr [ i ] [ j ] = 1 ;
  }
  int ans = 0 ;
  while ( dfs ( gr , 0 ) == - 1 ) {
    itta = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      gr [ i ] [ j ] = 0 ;
    }
  }
  return gr ;
}
