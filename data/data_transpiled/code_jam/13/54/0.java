public static void rl ( Scanner in ) {
  int cases = in . nextInt ( ) ;
  Map < Integer , Double > cache = new HashMap < > ( ) ;
  int n ;
  int status ;
  if ( status == ( 2 * n ) - 1 ) return ;
  Integer key = new Integer ( n ) ;
  if ( cache . containsKey ( key ) ) return cache . get ( key ) ;
  double ret = 0.0 ;
  for ( int arr : xrange ( n ) ) {
    int wait = 0 ;
    while ( status & ( 2 * ( ( arr + wait ) % n ) ) != 0 ) {
      wait ++ ;
    }
    ret += ( n - wait ) + go ( n , status + ( 2 * ( ( arr + wait ) % n ) ) ) ;
  }
  cache . put ( key , ret / n ) ;
  for ( int cc = 0 ;
  cc < cases ;
  cc ++ ) {
    String occupied = in . next ( ) . trim ( ) ;
    n = occupied . length ( ) ;
    status = Integer . valueOf ( occupied . charAt ( 0 ) ) ;
    System . out . println ( String . format ( "Case #%d: %.10lf" , cc + 1 , go ( n , status ) ) ) ;
  }
}
