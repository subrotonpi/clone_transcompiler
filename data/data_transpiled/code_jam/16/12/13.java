@ GwtIncompatible ( "collections" ) private static String compute ( int N , List < List < String >> A ) {
  final List < String > x = Arrays . asList ( A . get ( 0 ) ) ;
  final Multiset < String > c = HashMultiset . create ( ) ;
  x . addAll ( A ) ;
  Iterable < String > z = Stream . of ( x ) . filter ( a -> a . length ( ) % 2 == 1 ) . collect ( Collectors . toList ( ) ) ;
  z = new ArrayList < > ( ) ;
  for ( String a : z ) {
    z . add ( Integer . parseInt ( a ) ) ;
  }
  return Arrays . toString ( z ) ;
}
