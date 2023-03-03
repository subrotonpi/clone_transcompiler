public static void solve ( int cas , Range range ) {
  int n , k ;
  List < Integer > pieces = new ArrayList < > ( ) ;
  pieces . add ( n ) ;
  @ SuppressWarnings ( "resource" ) Map < Integer , Integer > ct = new HashMap < > ( ) ;
  ct . put ( n , ++ k ) ;
  for ( int i = 0 ;
  i < range . size ( ) ;
  i ++ ) {
    n = pieces . get ( i ) ;
    int c = ct . get ( n ) ;
    int mx = n >> 1 , mn = n - 1 >> 1 ;
    if ( k <= c ) break ;
    k -= c ;
    if ( ! ct . containsKey ( mx ) ) pieces . add ( mx ) ;
    ct . put ( mx , ++ c ) ;
    if ( ! ct . containsKey ( mn ) ) pieces . add ( mn ) ;
    ct . put ( mn , ++ c ) ;
  }
  System . out . println ( "Case #" + cas + ": " + mx + " " + mn ) ;
}
