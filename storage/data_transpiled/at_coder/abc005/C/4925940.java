static final int solve ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > a = new LinkedList < Integer > ( ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int cu = 0 ;
  cu < m ;
  cu ++ ) {
    for ( int ta = 0 ;
    ta < a . size ( ) ;
    ta ++ ) {
      if ( b . get ( cu ) - t <= a . get ( ta ) && b . get ( cu ) <= b . get ( cu ) ) {
        a . remove ( ta ) ;
        break ;
      }
    }
  }
  if ( a . size ( ) == n - m ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
  return a . size ( ) ;
}
