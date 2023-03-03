static void main ( String [ ] args ) {
  final int T = Integer . parseInt ( args [ 0 ] ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    final int N = Integer . parseInt ( args [ 1 ] ) ;
    final int L = Integer . parseInt ( args [ 2 ] ) ;
    final List < String > G = Arrays . asList ( args ) ;
    assert G . size ( ) == N && G . get ( 0 ) . length ( ) == L ;
    final String B = args [ 3 ] ;
    assert B . length ( ) == L ;
    String ret ;
    if ( G . contains ( B ) ) {
      ret = "IMPOSSIBLE" ;
    }
    else {
      ret = "0" + "1" + "1" + " " + "?0" + L ;
    }
    System . out . println ( "Case #" + t + ": " + ret ) ;
  }
}
