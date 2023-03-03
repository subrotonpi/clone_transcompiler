public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] csum_R = new int [ N ] ;
  int [ ] cmax_r1 = new int [ N ] ;
  int [ ] cmax_r2 = new int [ N ] ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    int v = src [ x ] ;
    csum_R [ x ] = csum_R [ x ] + v ;
    cmax_r1 [ x ] = Math . max ( cmax_r1 [ x ] , csum_R [ x ] - v ) ;
    cmax_r2 [ x ] = Math . max ( cmax_r2 [ x ] , csum_R [ x ] - 2 * v ) ;
  }
  int [ ] csum_L = new int [ N ] ;
  int [ ] cmax_l1 = new int [ N ] ;
  int [ ] cmax_l2 = new int [ N ] ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    int v = src [ x ] ;
    int x = C - x ;
    csum_L [ x ] = csum_L [ x ] + v ;
    cmax_l1 [ x ] = Math . max ( cmax_l1 [ x ] , csum_L [ x ] - v ) ;
    cmax_l2 [ x ] = Math . max ( cmax_l2 [ x ] , csum_L [ x ] - 2 * v ) ;
  }
  int ans = Math . max ( cmax_r1 [ N ] , cmax_l1 [ N ] ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    int b = cmax_r2 [ a ] ;
    ans = Math . max ( ans , a + b ) ;
  }
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    int b = cmax_l2 [ a ] ;
    ans = Math . max ( ans , a + b ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
