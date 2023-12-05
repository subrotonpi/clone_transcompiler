public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int miria = 1 ;
  miria <= N ;
  miria ++ ) {
    ans += miria * 10000 / N ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
