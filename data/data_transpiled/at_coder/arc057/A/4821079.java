public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = A ;
  if ( K == 0 ) {
    System . out . println ( 2 * 10 * 12 - A ) ;
  }
  else {
    int ans = 0 ;
    while ( t < 2 * 10 * 12 ) {
      t ++ + K * t ;
      ans ++ ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
