static int calc ( int steps , int r ) {
  return 2 * r * steps + ( 4 * steps - 2 ) * steps / 2 ;
  /* process the steps */
  r = Integer . parseInt ( readLine ( ) ) ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  int st = 0 ;
  int end = 100000000000000000000 ;
  while ( st < end ) {
    int mid = ( st + end + 1 ) / 2 ;
    if ( calc ( mid , r ) <= t ) {
      st = mid ;
    }
    else {
      end = mid - 1 ;
    }
  }
  System . out . println ( st ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = xrange ( T ) ;
  t >= 0 ;
  t = xrange ( t ) ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    process ( ) ;
  }
  return T ;
}
