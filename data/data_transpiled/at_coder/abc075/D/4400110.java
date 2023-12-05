@ VisibleForTesting static void binarySearch ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int K = input . nextInt ( ) ;
  int [ ] X = new int [ N + 1 ] ;
  int [ ] Y = new int [ N + 1 ] ;
  int [ ] [ ] info = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    X [ i ] = x ;
    Y [ i ] = y ;
    info [ i ] = new int [ N + 1 ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      X [ i ] [ j ] = input . nextInt ( ) ;
      Y [ i ] [ j ] = input . nextInt ( ) ;
    }
  }
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  int [ ] [ ] acc = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      acc [ i ] [ j ] = 0 ;
    }
    for ( int j = 0 ;
    j < N + 1 ;
    j ++ ) {
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        acc [ i ] [ j ] += acc [ i ] [ j ] ;
      }
    }
  }
  for ( int j = 0 ;
  j < N + 1 ;
  j ++ ) {
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      acc [ i + 1 ] [ j ] += acc [ i ] [ j ] ;
    }
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int t = 0 ;
  t < N - 1 ;
  t ++ ) {
    for ( int b = t + 1 ;
    b < N ;
    b ++ ) {
      for ( int l = 0 ;
      l < N - 1 ;
      l ++ ) {
        for ( int r = l + 1 ;
        r < N ;
        r ++ ) {
          double num = acc [ b + 1 ] [ r + 1 ] - acc [ b + 1 ] [ l ] - acc [ t ] [ r + 1 ] + acc [ t ] [ l ] ;
          if ( num < K ) continue ;
          double S = ( Y [ b ] - Y [ t ] ) * ( X [ r ] - X [ l