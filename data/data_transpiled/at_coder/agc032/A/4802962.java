public static int [ ] getB ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B . add ( i ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = B . size ( ) - 1 ;
    j >= 0 ;
    j -- ) {
      if ( B . get ( j ) == j + 1 ) {
        l . add ( j + 1 ) ;
        B . remove ( j ) ;
        break ;
      }
    }
  }
  if ( B . size ( ) == 0 ) {
    for ( int l_i = l . size ( ) - 1 ;
    l_i >= 0 ;
    l_i -- ) System . out . println ( l_i ) ;
  }
  else System . out . println ( - 1 ) ;
  return l . toArray ( new Integer [ 0 ] ) ;
}
