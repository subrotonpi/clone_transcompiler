static final int solve ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int [ ] inpl = new int [ ] {
    Integer . parseInt ( input ) }
    ;
    final int H = inpl [ 0 ] ;
    final int W = inpl [ 1 ] ;
    final int h = inpl [ 2 ] ;
    final int w = inpl [ 3 ] ;
    if ( H % h == 0 && W % w == 0 ) {
      System . out . println ( "No" ) ;
      return - 1 ;
    }
    final int [ ] [ ] ans = new int [ H ] [ W ] ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      ans [ i ] [ 0 ] = 1000 ;
    }
    return 0 ;
  }
  