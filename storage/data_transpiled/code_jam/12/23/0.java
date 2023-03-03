static final String toString ( ) {
  final String restr = "KONIEC" ;
  final StringBuilder sb = new StringBuilder ( ) ;
  final int t = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= t ;
  testCase ++ ) {
    System . out . format ( "Case #%d:" , testCase ) ;
    final TreeSet < Integer > T = new TreeSet < Integer > ( ) ;
    T . add ( Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ) ;
    final Map < Integer , Integer > D = Maps . newHashMap ( ) ;
    for ( final Integer subset : T ) {
      final int s = Ints . checkedCast ( subset ) ;
      if ( D . containsKey ( s ) ) {
        sb . append ( subset ) ;
        sb . append ( D . get ( s ) ) ;
        break ;
      }
      D . put ( s , subset ) ;
    }
  }
  return sb . toString ( ) ;
}
