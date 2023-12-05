@ VisibleForTesting static int C = Integer . parseInt ( Scanner in ) {
  for ( int testCase : xrange ( 1 , C + 1 ) ) {
    List < Integer > ts = new ArrayList < Integer > ( ) ;
    for ( String t : in . nextLine ( ) . split ( " " ) ) {
      ts . add ( Integer . parseInt ( t ) ) ;
    }
    int m = min ( ts ) ;
    List < Integer > td = new ArrayList < Integer > ( ts ) ;
    for ( Integer t : ts ) {
      td . add ( t - m ) ;
    }
    int T = reduce ( td ) ;
    System . out . println ( "Case #" + testCase + ":" + ( T - m ) % T ) ;
  }
  return C ;
}
