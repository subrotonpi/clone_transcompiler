private static int [ ] [ ] solve ( int n , int m ) {
  int [ ] [ ] A = new int [ n + 1 ] [ n + 1 ] ;
  Set < Integer > eve = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) A [ i ] [ 0 ] = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) eve . add ( new Integer ( i ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ a ] . add ( b ) ;
    A [ b ] . add ( a ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int cnt = 0 ;
    for ( int j = 0 ;
    j < eve . size ( ) ;
    j ++ ) if ( A [ i ] [ j ] . equals ( eve . get ( i ) ) ) ++ cnt ;
    System . out . println ( cnt ) ;
  }
  return A ;
}
