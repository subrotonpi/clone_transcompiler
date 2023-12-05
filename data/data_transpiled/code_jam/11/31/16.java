static final Scanner inf = new Scanner ( System . in ) {
  final PrintWriter ouf = new PrintWriter ( System . out ) ;
  /* Close files */
  inf . close ( ) ;
  ouf . close ( ) ;
  /* Precount */
  int printcounter = 0 ;
  /* Print String */
  printcounter ++ ;
  /* Print String */
  System . out . println ( ">>> Case #" + printcounter + ": " + a ) ;
  /* Solve test */
  Arrays . sort ( a ) ;
  int r = Integer . parseInt ( inf . nextLine ( ) ) ;
  int c = Integer . parseInt ( inf . nextLine ( ) ) ;
  char [ ] [ ] a = new char [ r ] [ c ] ;
  for ( int i = 0 ;
  i < xrange . length ;
  i ++ ) {
    a [ i ] = new char [ r ] ;
  }
  boolean bad = false ;
  for ( int i = 0 ;
  i < xrange . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < xrange . length ;
    j ++ ) {
      if ( a [ i ] [ j ] == '#' ) {
        if ( i == r - 1 || j == c - 1 ) {
          bad = true ;
          break ;
        }
        if ( a [ i + 1 ] [ j ] != '#' || a [ i ] [ j + 1 ] != '#' || a [ i + 1 ] [ j + 1 ] != '#' ) {
          bad = true ;
          break ;
        }
        a [ i ] [ j ] = '/' ;
        a [ i + 1 ] [ j ] = '\\' ;
        a [ i ] [ j + 1 ] = '\\' ;
        a [ i + 1 ] [ j + 1 ] = '/' ;
      }
    }
  }
  /* Print String */
  printcounter ++ ;
  /* Print String */
  int testnum = Integer . parseInt ( inf . nextLine ( ) ) ;
  for ( int test = 0 ;
  test < testnum ;
  test ++ ) {
    solvetest ( ) ;
  }
  /* Print String */
  return ouf . println ( ) ;
}
