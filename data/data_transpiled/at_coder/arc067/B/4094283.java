public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int dist = X [ i + 1 ] - X [ i ] ;
    ans += Math . min ( dist * A , B ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
