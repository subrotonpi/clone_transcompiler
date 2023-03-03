public static void print ( int t ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( i ) ;
  }
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( n < m ) {
    System . out . println ( "no" ) ;
    exit ( ) ;
  }
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    for ( int l = 0 ;
    l < a . size ( ) ;
    l ++ ) {
      if ( b [ i - t - 1 ] < a [ l ] && a [ l ] < b [ i ] + 1 ) {
        a . remove ( l ) ;
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
}
