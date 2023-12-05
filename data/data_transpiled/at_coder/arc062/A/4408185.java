public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] TA = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    TA [ i ] [ 0 ] = t ;
    TA [ i ] [ 1 ] = a ;
  }
  int t0 = 1 , a0 = 1 ;
  for ( int t = 0 ;
  t < TA . length ;
  t ++ ) {
    int a = TA [ t ] [ 1 ] ;
    t0 = - ( - t0 / t ) * t ;
    a0 = - ( - a0 / a ) * a ;
    if ( t0 / a0 < t / a ) t0 = t * a0 / a ;
    else a0 = a * t0 / t ;
  }
  int ans = t0 + a0 ;
  System . out . println ( ans ) ;
  return ans ;
}
