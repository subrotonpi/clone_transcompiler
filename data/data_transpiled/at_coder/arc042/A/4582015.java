private static int [ ] getMatchingValues ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = a . clone ( ) ;
  a [ 0 ] = a [ 0 ] + 1 ;
  Set < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ! s . contains ( a [ i ] ) ) {
      System . out . println ( a [ i ] ) ;
      s . add ( a [ i ] ) ;
    }
  }
  return s . toArray ( ) ;
}
