static int N = Integer . parseInt ( input ) {
  List < List < Integer >> P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  final int INF = 10 * 18 ;
  @ SuppressWarnings ( "unused" ) int l0 , r0 ;
  List < Integer > L = new ArrayList < > ( ) ;
  L . add ( - l0 + 1 ) ;
  List < Integer > R = new ArrayList < > ( ) ;
  R . add ( l0 - 1 ) ;
  int s = 0 ;
  int t = 0 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    l0 = P . get ( i ) ;
    r0 = P . get ( i ) ;
    int l1 = P . get ( i + 1 ) ;
    int r1 = P . get ( i + 1 ) ;
    s += ( r1 - l1 ) ;
    t += ( r0 - l0 ) ;
    if ( - s - L . get ( 0 ) <= l1 - 1 && t + R . get ( 0 ) < l1 ) {
      L . add ( - l1 + 1 - s ) ;
      R . add ( R ) ;
      int p = - Integer . MAX_VALUE - s ;
      R . add ( R ) ;
      R . add ( p - t ) ;
      res += ( p - ( l1 - 1 ) ) ;
    }
    else if ( t + R . get ( 0 ) < l1 - 1 ) {
      R . add ( R ) ;
      R . add ( l1 - 1 - t ) ;
      int p = Integer . MAX_VALUE + t ;
      R . add ( R ) ;
      R . add ( p - s ) ;
      res += ( l1 - 1 - p ) ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
