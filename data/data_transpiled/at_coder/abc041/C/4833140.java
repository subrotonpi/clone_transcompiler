public static int N = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] [ ] A = new int [ a . length ] [ ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int ai = a [ i ] ;
    A [ i ] [ 0 ] = ai ;
    A [ i ] [ 1 ] = i + 1 ;
  }
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int ai = A [ i ] [ 0 ] ;
    A [ i ] [ 0 ] = ai ;
    A [ i ] [ 1 ] = ai ;
  }
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int ai = A [ i ] [ 0 ] ;
    A [ i ] [ 1 ] = ai ;
  }
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int ai = A [ i ] [ 0 ] ;
    A [ i ] [ 0 ] = ai ;
    A [ i ] [ 1 ] = ai ;
  }
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int ai = A [ i ] [ 0 ] ;
    A [ i ] [ 1 ] = ai