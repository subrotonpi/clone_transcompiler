public static int getInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans ;
  if ( N != 1 && M != 1 ) {
    ans = N * M - ( 2 * N + 2 * M - 4 ) ;
  }
  else {
    if ( N == 1 && M == 1 ) {
      ans = 1 ;
    }
    else {
      ans = N * M - 2 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
