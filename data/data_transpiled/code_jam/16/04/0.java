public static int [ ] int2base ( int [ ] x , int b ) {
  int at = 1 ;
  int ans = 0 ;
  for ( int dig : x ) {
    ans += at * dig ;
    at *= b ;
  }
  return ans ;
  /* fill the list of integers */
  int i = 0 ;
  while ( li . length < n ) {
    if ( ! li [ i ] . equals ( Integer . MIN_VALUE ) ) li [ i ] = i ;
    ++ i ;
  }
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    int k = Integer . parseInt ( readLine ( ) ) ;
    int c = Integer . parseInt ( readLine ( ) ) ;
    int s = Integer . parseInt ( readLine ( ) ) ;
    if ( c * s < k ) {
      System . out . println ( "Case #" + cas + ": IMPOSSIBLE" ) ;
      continue ;
    }
    int [ ] digs = xrange ( k ) ;
    int [ ] ans = new int [ k ] ;
    int [ ] cur = new int [ c ] ;
    for ( int i = 0 ;
    i < digs . length ;
    ++ i ) {
      if ( ( cur = cur [ i ] ) == c ) {
        ans [ i ] = int2base ( cur , k ) + 1 ;
        cur = new int [ c ] ;
      }
      cur [ i ] = digs [ i ] ;
    }
    while ( ( cur = cur [ 0 ] ) != c ) cur [ 0 ] = 0 ;
    ans [ i ] = int2base ( cur , k ) + 1 ;
    System . out . println ( "Case #" + cas + ": " + Arrays . toString ( ans ) ) ;
  }
}
