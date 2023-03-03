public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = Integer . MIN_VALUE ;
  int now = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    now -= A [ i ] ;
    now += A [ i + K ] ;
    ans += now ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
