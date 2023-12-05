public static int getInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( ( M / 2 >= N ) ) {
    ans += N ;
    M -= N * 2 ;
    ans += M / 4 ;
  }
  else {
    ans += M / 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
