@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > [ ] items = new Map [ N ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    items [ i ] = new HashMap < > ( ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int [ ] com = new int [ M ] ;
    for ( int c : com ) {
      for ( Map . Entry < Integer , Integer > e : items [ c - 1 ] . entrySet ( ) ) {
        man [ e . getKey ( ) ] += e . getValue ( ) ;
      }
    }
    Collections . sort ( man , Collections . reverseOrder ( ) ) ;
    ans = Math . max ( ans , Arrays . asList ( man ) . subList ( 0 , Q ) ) ;
  }
  System . out . println ( ans ) ;
  return items ;
}
