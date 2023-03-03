static final Iterable < List < Integer >> combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < List < Integer >> friends = Sets . newLinkedHashSet ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    friends . add ( ImmutableList . of ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( List < Integer > chosen : Lists . newArrayList ( ) ) {
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      if ( Arrays . equals ( friends , chosen . get ( i ) ) ) {
        System . out . println ( chosen . size ( ) ) ;
        break ;
      }
    }
  }
  return friends ;
}
