@ GwtIncompatible ( "collections.Iterable" ) public static Collection < String > readStrings ( String ... argv ) {
  final Case Case Case = new Case ( ) ;
  final Scanner in = new Scanner ( argv [ 0 ] ) ;
  final int cases = in . nextInt ( ) ;
  for ( int i = 1 ;
  i <= cases ;
  i ++ ) {
    System . out . printf ( "Case #%d:" , ( i ) ) ;
    for ( String line : solvecase ( in ) ) {
      System . out . println ( line ) ;
    }
  }
  return ans != null ? Arrays . asList ( "Impossible" ) : Arrays . asList ( "Impossible" ) ;
}
