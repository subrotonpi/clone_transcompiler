@ Sys . Enter public static int enter ( ) {
  int z = input . nextInt ( ) ;
  for ( int cas : xrange ( 1 , z + 1 ) ) {
    int r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) , t = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int L = 0 , R = t + 2 ;
    while ( R - L > 1 ) {
      int n = L + R >> 1 ;
      if ( n * ( 2 * r + 1 ) + 2 * n * ( n - 1 ) <= t ) L = n ;
      else R = n ;
    }
    System . out . println ( "Case #" + cas + ": " + L ) ;
  }
  return z ;
}
