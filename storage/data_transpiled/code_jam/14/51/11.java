public static void get ( @ NotNull Scanner in ) {
  get ( in ) ;
  int T = in . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = in . nextInt ( ) ;
    int p = in . nextInt ( ) ;
    int q = in . nextInt ( ) ;
    int r = in . nextInt ( ) ;
    int s = in . nextInt ( ) ;
    int [ ] t = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      t [ i ] = ( in . nextInt ( ) * p + q ) % r + s ;
    }
    int total = in . nextInt ( ) ;
    int [ ] c = new int [ N ] ;
    c [ 0 ] = 0 ;
    for ( int x : t ) {
      c [ b ] = c [ b ] - c [ a ] ;
    }
    int a = 0 ;
    int b = 0 ;
    int best = 0 ;
    while ( b <= N ) {
      if ( a == b || c [ b ] - c [ a ] <= total / 3 ) {
        b ++ ;
        if ( b > N ) break ;
      }
      else {
        a ++ ;
      }
      best = Math . max ( best , total - Math . max ( ( c [ a ] = c [ b ] - c [ a ] ) , total - c [ b ] ) ) ;
    }
    System . out . println ( "Case #" + testCase + ": " + ( ( double ) best ) / ( ( double ) total ) ) ;
  }
}
