public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int k = 0 ;
  int [ ] L = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input ) ;
  }
  double [ ] [ ] B = new double [ N ] [ N ] ;
  while ( k < N ) {
    B [ L . length - 1 ] [ 0 ] = Double . MAX_VALUE ;
    B [ L . length - 1 ] [ 1 ] = false ;
    B [ L . length - 1 ] [ 0 ] = k + 1 ;
    k ++ ;
  }
  for ( int i = L . length - 1 ;
  i >= 0 ;
  i -- ) {
    if ( B [ L [ i ] - 1 ] [ 1 ] == false ) {
      B [ L [ i ] - 1 ] [ 1 ] = true ;
      B [ L [ i ] - 1 ] [ 0 ] = N - i ;
    }
  }
  Arrays . sort ( B ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( B [ i ] [ 2 ] ) ;
  }
}
