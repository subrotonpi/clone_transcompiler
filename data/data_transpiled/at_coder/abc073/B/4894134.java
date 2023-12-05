public static int N ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    ans += r - l ;
  }
  System . out . println ( ans + N ) ;
  return ans ;
}
