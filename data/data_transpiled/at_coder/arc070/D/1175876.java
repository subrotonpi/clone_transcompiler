@ VisibleForTesting static void print ( ) {
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  final BiFunction < Integer , Integer , Boolean > ask = ( x , y ) -> System . out . print ( "?" + x + " " + y ) ;
  if ( A <= B ) {
    System . out . println ( "Impossible" ) ;
    System . exit ( 0 ) ;
  }
  final int N = A + B ;
  final Queue < Integer > candidates = new LinkedList < > ( ) ;
  while ( candidates . size ( ) > 2 ) {
    final int x = candidates . poll ( ) ;
    final int y = candidates . poll ( ) ;
  }
}
