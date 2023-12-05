private static void getinput ( ) {
  int N = input . nextInt ( ) ;
  int L = map . getInt ( ) ;
  int P = map . getInt ( ) ;
  /* go through the input */
  N = N ;
  L = map . getInt ( ) ;
  P = map . getInt ( ) ;
  /* go through the input */
  int [ ] [ ] ans = zip ( L , P , N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int cs = 0 ;
    int cp = 1 ;
    for ( int j = 1 ;
    j < N - i ;
    j ++ ) {
      if ( ans [ j ] [ 1 ] * ans [ j - 1 ] [ 0 ] > ans [ j - 1 ] [ 1 ] * ans [ j ] [ 0 ] ) {
        ans [ j - 1 ] [ 0 ] = ans [ j ] [ 1 ] ;
        ans [ j ] [ 1 ] = ans [ j ] [ 1 ] ;
        ans [ j ] [ 2 ] = ans [ j - 1 ] [ 2 ] ;
      }
    }
  }
  /* go through the input */
  T = input . nextInt ( ) ;
  int [ ] inps = new int [ T ] [ ] ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    inps [ t ] = getinput ( ) ;
  }
  @ SuppressWarnings ( "unused" ) int [ ] res = p . invokeExact ( inps ) ;
  for ( int t = 0 ;
  t < res . length ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res [ t ] ) ;
  }
}
