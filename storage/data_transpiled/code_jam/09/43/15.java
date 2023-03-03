@ VisibleForTesting static Iterable < List < Integer >> combinations ( ) {
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int N = ( Integer ) input . nextLine ( ) ;
    final int K = ( Integer ) input . nextLine ( ) ;
    final List < List < Integer >> stocks = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      stocks . add ( ImmutableList . of ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    }
    return new Iterable < List < Integer >> ( ) {
      @ Override public boolean iterator ( ) {
        return stocks . stream ( ) . allMatch ( a -> {
          final int a = a ;
          final int b = b ;
          final int c = a - 1 ;
          final int d = b - 1 ;
          return ! ( a < c && b < d || a > c && b > d ) ;
        }
        ) ;
      }
    }
    ;
  }
  final List < List < Integer >> ints = new ArrayList < > ( ) ;
  for ( List < Integer > s : stocks ) {
    ints . add ( s . stream ( ) . filter ( i -> Arrays . stream ( s ) . allMatch ( intersect ( s , i ) ) ) . collect ( Collectors . toList ( ) ) ) ;
  }
  System . out . println ( String . format ( "Case #%s: %s" , t , Math . max ( i . size ( ) - 1 , ints . size ( ) ) ) ) ;
  return ints ;
}
