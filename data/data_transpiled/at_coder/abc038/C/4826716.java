public static void print ( int n ) {
  int [ ] X = Integer . parseInt ( input ( ) ) ;
  int cnt = 1 ;
  int ans = n ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( X [ i ] < X [ i + 1 ] ) {
      cnt ++ ;
      if ( i == n - 2 ) ans += ( cnt - 1 ) * cnt / 2 ;
    }
    else {
      ans += ( cnt - 1 ) * cnt / 2 ;
      cnt = 1 ;
    }
  }
  System . out . println ( ans ) ;
}
