public static void main ( String [ ] args ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  for ( int t : xrange ( 1 , 1 + Integer . parseInt ( scanner . nextLine ( ) ) ) ) {
    System . out . printf ( "Case #%d:%n" , t ) ;
    final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Set < Integer > s = new HashSet < > ( ) ;
    for ( final int t : xrange ( 2 * N - 1 ) ) {
      final int a = Integer . parseInt ( scanner . nextLine ( ) ) ;
      s . addAll ( Arrays . asList ( a ) ) ;
    }
    System . out . println ( Arrays . toString ( s . toArray ( new Integer [ s . size ( ) ] ) ) ) ;
    assert s . size ( ) == N ;
  }
}
