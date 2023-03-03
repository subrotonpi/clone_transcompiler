public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = i ;
    j < N ;
    j ++ ) {
      ans = Math . abs ( A [ i ] - A [ j ] ) > ans ? Math . abs ( A [ i ] - A [ j ] ) : ans ;
    }
  }
  System . out . println ( ans ) ;
}
