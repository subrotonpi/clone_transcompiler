static final int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> relations = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    relations . add ( ImmutableList . copyOf ( transform ( input . readLine ( ) , new Function < Integer , Integer > ( ) {
      @ Override public Integer apply ( Integer input ) {
        return input . intValue ( ) ;
      }
    }
    ) ) ) ;
  }
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( Arrays . asList ( relations . get ( j ) ) . contains ( i ) ) {
        System . out . println ( i ) ;
        break ;
      }
    }
    else {
      continue ;
    }
    break ;
  }
  return relations . get ( i ) ;
}
