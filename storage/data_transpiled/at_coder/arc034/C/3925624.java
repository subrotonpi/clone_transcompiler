public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > C = new HashMap < > ( ) ;
  for ( int i = B + 1 ;
  i <= A ;
  i ++ ) {
    int y = i ;
    int x = 2 ;
    while ( x * x <= y ) {
      if ( y % x == 0 ) {
        int cnt = 0 ;
        while ( y % x == 0 ) {
          cnt ++ ;
          y /= x ;
        }
        C . put ( x , C . getOrDefault ( x , 0 ) + cnt ) ;
      }
      x ++ ;
    }
    if ( y > 1 ) C . put ( y , C . getOrDefault ( y , 0 ) + 1 ) ;
  }
  int MOD = 10 * 9 + 7 ;
  int ans = 1 ;
  for ( int v : C . values ( ) ) ans = ( ans * ( v + 1 ) ) % MOD ;
  System . out . println ( ans ) ;
  return ans ;
}
