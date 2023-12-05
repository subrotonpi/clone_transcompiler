public static void PerfectDeck ( ) {
  int [ ] l = new int [ K ] ;
  int [ ] pos = new int [ K ] ;
  int n = 1 ;
  int old_p = 0 ;
  while ( n <= K ) {
    int p = ( n - 1 + old_p ) % pos . length ;
    l [ pos [ p ] ] = n ;
    -- n ;
    ++ old_p ;
    ++ p ;
  }
  int at [ ] = l [ i - 1 ] ;
  if ( getClass ( ) . equals ( "com.codejam.util.Scanner" ) ) {
    @ SuppressWarnings ( "resource" ) Scanner s = new Scanner ( System . in ) ;
    int N = s . nextInt ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      int K = s . nextInt ( ) ;
      PerfectDeck d = new PerfectDeck ( K ) ;
      int n = s . nextInt ( ) ;
      l = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) l [ j ] = d . at ( s . nextInt ( ) ) ;
      System . out . println ( "Case #" + i + ":" ) ;
      for ( int a : l ) System . out . println ( a + "," ) ;
      System . out . println ( "" ) ;
    }
  }
}
