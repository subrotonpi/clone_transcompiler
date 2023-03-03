public static void inpl ( ) {
  inpl ( ) ;
  int N = inpl ( ) ;
  int x = inpl ( ) ;
  int [ ] A = inpl ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( A [ i - 1 ] + A [ i ] <= x ) continue ;
    int tmp = A [ i - 1 ] + A [ i ] - x ;
    ans += tmp ;
    if ( tmp >= A [ i ] ) A [ i ] = 0 ;
    else A [ i ] -= tmp ;
  }
  System . out . println ( ans ) ;
}
