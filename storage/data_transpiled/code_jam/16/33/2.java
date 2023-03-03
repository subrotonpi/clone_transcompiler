public static int t = Integer . parseInt ( input ) {
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    int j = Integer . parseInt ( input . readLine ( ) ) ;
    int p = Integer . parseInt ( input . readLine ( ) ) ;
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    int k = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( j * p * Math . min ( s , k ) ) ;
    int u = Math . min ( s , k ) ;
    for ( int a = 0 ;
    a < j ;
    a ++ ) {
      for ( int b = 0 ;
      b < p ;
      b ++ ) {
        for ( int r = 0 ;
        r < u ;
        r ++ ) {
          int c = ( a + b + r ) % s ;
          System . out . println ( a + 1 + "," + b + 1 + "," + c + 1 ) ;
        }
      }
    }
  }
  return t ;
}
