public static void print ( String [ ] [ ] input ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] ) ;
  int [ ] [ ] B = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] [ i ] = Integer . parseInt ( input [ 2 ] ) ;
  }
  int [ ] [ ] A = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A [ i ] [ i ] = 0 ;
  }
}
