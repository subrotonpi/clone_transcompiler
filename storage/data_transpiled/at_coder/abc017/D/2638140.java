public static int [ ] dp ( int n , Map < Integer , Integer > m ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = 10 * 9 + 7 ;
  int [ ] a2 = new int [ n ] ;
  int left = 0 ;
  m = Maps . newHashMap ( ) ;
  for ( int right = 0 ;
  right < n ;
  right ++ ) {
    m . put ( a [ right ] , m . getOrDefault ( a [ right ] , 0 ) + 1 ) ;
    while ( left < right && m . getOrDefault ( a [ right ] , 0 ) > 1 ) {
      m . put ( a [ left ] , m . getOrDefault ( a [ left ] , 1 ) - 1 ) ;
      left ++ ;
    }
    a2 [ right ] = left ;
  }
  int [ ] dp = new int [ n ] ;
  dp [ 1 ] = 1 ;
  int sumdp [ ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] = sumdp [ n - 1 ] - sumdp [ a2 [ i ] ] ;
    sumdp [ i ] = ( sumdp [ i ] + dp [ n - 1 ] ) % w ;
  }
  System . out . println ( dp [ n - 1 ] % w ) ;
  return dp ;
}
