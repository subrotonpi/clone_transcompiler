public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    N = input . nextInt ( ) ;
    String [ ] A = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) A [ i ] = in . next ( ) ;
    double [ ] WP = new double [ N ] ;
    double [ ] C = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( A [ i ] . charAt ( j ) != '.' ) C [ i ] ++ ;
        if ( A [ i ] . charAt ( j ) == '1' ) WP [ i ] ++ ;
      }
      WP [ i ] /= C [ i ] ;
    }
    double [ ] OWP = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( A [ i ] . charAt ( j ) == '1' ) OWP [ i ] += WP [ j ] * C [ j ] / ( C [ j ] - 1 ) ;
        if ( A [ i ] . charAt ( j ) == '0' ) OWP [ i ] += ( WP [ j ] * C [ j ] - 1 ) / ( C [ j ] - 1 ) ;
      }
      OWP [ i ] /= C [ i ] ;
    }
    double [ ] OOWP = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( A [ i ] . charAt ( j ) != '.' ) OOWP [ i ] += OWP [ j ] ;
      }
      OOWP [ i ] /= C [ i ] ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( 0.25 * WP [ i ] + 0.50 * OWP [ i ] + 0.25 * OOWP [ i ] ) ;
    }
  }
}
