public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int C = Integer . MAX_VALUE ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i <= n - k ;
  i ++ ) {
    C -= X [ i ] ;
    C += X [ i + k ] ;
    ans += C ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
