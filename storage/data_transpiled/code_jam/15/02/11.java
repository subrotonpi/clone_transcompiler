public static int solve ( ) {
  int d = Integer . parseInt ( readLine ( ) ) ;
  int [ ] p = ArrayUtil . toIntArray ( readLine ( ) . split ( " " ) ) ;
  int ans = max ( p ) ;
  for ( int i : xrange ( 1 , max ( p ) ) ) {
    int t = 0 ;
    for ( int x : p ) {
      int q = x % i ;
      boolean r = ( q > 0 ) ;
      if ( r ) t ++ ;
      t += q - 1 ;
    }
    if ( ans > t + i ) ans = t + i ;
  }
  return ans ;
  int T = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
  for ( int i : xrange ( T ) ) System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  return T ;
}
