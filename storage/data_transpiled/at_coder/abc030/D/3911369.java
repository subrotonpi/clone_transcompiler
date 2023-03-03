public static int N ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int [ ] g = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    g [ i ] = i + 1 ;
  }
  Set < Integer > visited = new HashSet < Integer > ( ) ;
  int [ ] p = new int [ N ] ;
  {
    dfs ( i ) ;
  }
  {
    if ( visited . contains ( i ) ) {
      p [ 0 ] = i ;
      return ;
    }
    visited . add ( i ) ;
    p [ 0 ] = i ;
    dfs ( g [ i ] ) ;
  }
  dfs ( a ) ;
  {
    int i = a . indexOf ( a [ a . length - 1 ] ) ;
    return a . length - i - 1 ;
  }
  if ( k - p . length + 1 <= 0 ) {
    System . out . println ( p [ k ] ) ;
  }
  else {
    k = k - p . length + 1 ;
    k = k % s ( p ) ;
    int i = p . length - 1 ;
    System . out . println ( p [ i + k ] ) ;
  }
  return i ;
}
