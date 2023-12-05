public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int t = 0 ;
  t < N ;
  t ++ ) {
    if ( t > 0 && h [ t - 1 ] >= h [ t ] ) continue ;
    if ( t < N - 1 && h [ t ] <= h [ t + 1 ] ) continue ;
    int s = t ;
    while ( s > 0 && h [ s - 1 ] < h [ s ] ) s -- ;
    int u = t ;
    while ( u < N - 1 && h [ u ] > h [ u + 1 ] ) u ++ ;
    ans = Math . max ( ans , u - s + 1 ) ;
  }
  System . out . println ( ans ) ;
}
