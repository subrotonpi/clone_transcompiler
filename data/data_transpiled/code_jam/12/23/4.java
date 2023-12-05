static final String print ( String s ) {
  final int T = Integer . parseInt ( s ) ;
  final int [ ] ints = s . split ( " " ) ;
  final int N = ints . length ;
  final int [ ] nums = s . split ( " " ) ;
  if ( ints . length != N ) throw new IllegalStateException ( "bad parsing" ) ;
  final HashMap < Integer , Set < String >> sums = new HashMap < > ( ) ;
  for ( final Set < String > subset : powerSet ( nums ) ) {
    final int s = Integer . parseInt ( subset . toString ( ) ) ;
    for ( final Set < String > other : sums . computeIfAbsent ( s , k -> new HashSet < > ( ) ) ) {
      if ( subset . equals ( other ) ) throw new IllegalStateException ( "something is wrong" ) ;
      final Set < String > set = new HashSet < > ( subset ) ;
      final Set < String > set = new HashSet < > ( other ) ;
      final Set < String > t = set . containsAll ( other ) ;
      set . retainAll ( t ) ;
      other . retainAll ( t ) ;
      final String res = "\n" + set . toString ( ) + "\n" + set . toString ( ) ;
      return res ;
    }
    sums . get ( s ) . add ( subset ) ;
  }
  return "Impossible" ;
}
