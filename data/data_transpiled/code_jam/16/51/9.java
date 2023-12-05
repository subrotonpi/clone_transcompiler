public static void xrange ( int testCase , int input ) {
  Scanner S = new Scanner ( System . in ) ;
  int ans = 0 ;
  int c = 1 ;
  while ( c != 0 ) {
    c = 0 ;
    String X = "" ;
    for ( int i = 0 ;
    i < S . nextInt ( ) ;
    i ++ ) {
      if ( X . length ( ) == 0 ) X += S . nextInt ( ) ;
      else {
        if ( S . nextInt ( ) == X . length ( ) - 1 ) {
          X = X . substring ( 0 , X . length ( ) - 1 ) ;
          ans += 10 ;
          c = 1 ;
        }
        else X += S . nextInt ( ) ;
      }
    }
    S = X ;
  }
  System . out . println ( "Case #" + testCase + ":" ) ;
  System . out . println ( ans + X . length ( ) / 2 * 5 ) ;
}
