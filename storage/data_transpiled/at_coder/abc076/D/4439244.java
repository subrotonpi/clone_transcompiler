public static int N = Integer . parseInt ( input ) {
  List < Integer > ts = Lists . newArrayList ( ) ;
  List < Integer > vs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = ts . size ( ) ;
    maxv . set ( 0 , Math . min ( maxv . get ( maxv . size ( ) - 1 ) , v ) ) ;
    for ( int ti = 0 ;
    ti < t * 2 ;
    ti ++ ) {
      maxv . add ( v ) ;
    }
  }
  maxv . set ( 0 , 0 ) ;
  int T = maxv . size ( ) ;
  for ( int i = 0 ;
  i < T - 1 ;
  i ++ ) {
    maxv . set ( i + 1 , Math . min ( maxv . get ( i + 1 ) , maxv . get ( i ) + 0.5 ) ) ;
  }
  for ( int i = 0 ;
  i < T - 1 ;
  i ++ ) {
    maxv . set ( i , ( maxv . get ( i ) + maxv . get ( i + 1 ) ) / 4 ) ;
  }
  System . out . println ( ans ) ;
  return 0 ;
}
