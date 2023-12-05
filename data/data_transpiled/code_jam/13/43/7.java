@ Sys public static void main ( String [ ] args ) {
  int testcases = Integer . parseInt ( args [ 0 ] ) ;
  for ( int testcase : xrange ( 1 , testcases + 1 ) ) {
    int N = Integer . parseInt ( args [ 0 ] ) ;
    int [ ] A = ArrayUtil . splitInt ( args [ 1 ] , args [ 2 ] ) ;
    int [ ] B = ArrayUtil . splitInt ( args [ 3 ] , args [ 4 ] ) ;
    int [ ] [ ] g = new int [ N ] [ N ] ;
    for ( int i : xrange ( N ) ) g [ i ] = new int [ N ] ;
    for ( int i : xrange ( 1 , N ) ) {
      g [ i ] [ i ] = 0 ;
    }
    for ( int i : xrange ( 1 , N ) ) {
      boolean lessOne = true ;
      for ( int j : xrange ( i - 1 , - 1 , - 1 ) ) {
        if ( A [ j ] == A [ i ] - 1 && lessOne ) {
          g [ i ] [ j ] = 1 ;
          lessOne = false ;
        }
        if ( A [ j ] >= A [ i ] ) g [ j ] [ i ] = 1 ;
      }
    }
    for ( int i : xrange ( N - 2 , - 1 , - 1 ) ) {
      boolean lessOne = true ;
      for ( int j : xrange ( i + 1 , N ) ) {
        if ( B [ j ] == B [ i ] - 1 && lessOne ) {
          g [ i ] [ j ] = 1 ;
          lessOne = false ;
        }
        if ( B [ j ] >= B [ i ] ) g [ j ] [ i ] = 1 ;
      }
    }
    int [ ] result = new int [ N ] ;
    int [ ] d = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        d [ i ] += g [ i ] [ j ] ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int x = 0 ;
      x < N ;
      x ++ ) {
        if ( d [ x ] == 0 ) {
          result [ x ] = i + 1 ;
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            if ( g [ j ] [ x ] != 0 ) {
              g [ j ] [ x ] = 0 ;
              d [ j