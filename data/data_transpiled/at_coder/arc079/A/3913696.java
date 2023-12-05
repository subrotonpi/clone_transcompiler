public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > isIncluded1 = new HashSet < > ( ) ;
  Set < Integer > isIncludedN = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int ai = Integer . parseInt ( input . nextLine ( ) ) ;
    int bi = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ai == 1 ) {
      isIncluded1 . add ( bi ) ;
    }
    else if ( bi == 1 ) {
      isIncluded1 . add ( ai ) ;
    }
    if ( ai == n ) {
      isIncludedN . add ( bi ) ;
    }
    else if ( bi == n ) {
      isIncludedN . add ( ai ) ;
    }
  }
  if ( isIncluded1 . stream ( ) . filter ( i -> i != 0 ) . count ( ) > 0 ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
}
