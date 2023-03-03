public static void main ( String [ ] args ) {
  final int nc = Integer . parseInt ( args [ 0 ] ) ;
  for ( int cNum : xrange ( 1 , 1 + nc ) ) {
    final int e = Integer . parseInt ( args [ cNum ] ) ;
    final int r = Integer . parseInt ( args [ cNum ] ) ;
    final int n = Integer . parseInt ( args [ cNum ] ) ;
    final int [ ] vs = Integer . parseInt ( args [ n ] ) ;
    final int [ ] best = new int [ e + 1 ] ;
    for ( int v : vs ) {
      final int [ ] nxtB = new int [ n ] ;
      for ( int i : xrange ( e + 1 ) ) {
        for ( int k : xrange ( i + 1 ) ) {
          nxtB [ remE ] = Math . max ( nxtB [ remE ] , best [ i ] + k * v ) ;
        }
      }
      best = nxtB ;
    }
    System . out . println ( "Case #" + cNum + ": " + max ( best ) ) ;
  }
}
