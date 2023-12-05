public static void ri ( Scanner in ) {
  int t = in . nextInt ( ) ;
  for ( int case : xrange ( 1 , t + 1 ) ) {
    int [ ] foo = map . get ( in . nextInt ( ) ) ;
    int n = foo [ 0 ] ;
    int s = foo [ 1 ] ;
    int p = foo [ 2 ] ;
    int base = 0 ;
    int depends = 0 ;
    for ( int i = 3 ;
    i < n ;
    i ++ ) {
      int score = foo [ i ] ;
      if ( score == 0 ) {
        if ( p == 0 ) {
          base ++ ;
        }
      }
      else if ( score % 3 == 0 ) {
        if ( score / 3 >= p ) {
          base ++ ;
        }
        else if ( score / 3 == p - 1 ) {
          depends ++ ;
        }
      }
      else if ( score % 3 == 1 ) {
        if ( score / 3 + 1 >= p ) {
          base ++ ;
        }
      }
      else {
        if ( score / 3 + 1 >= p ) {
          base ++ ;
        }
        else if ( score / 3 + 1 == p - 1 ) {
          depends ++ ;
        }
      }
    }
    int ans = base + Math . min ( depends , s ) ;
    System . out . printf ( "Case #%d:%n" , case ) ;
  }
}
