public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int now = a [ 0 ] ;
  int i = 1 ;
  while ( i < N ) {
    if ( now == a [ i ] ) {
      ans ++ ;
      if ( i == N - 1 ) break ;
      now = a [ i + 1 ] ;
      i += 2 ;
    }
    else {
      now = a [ i ] ;
      i ++ ;
    }
  }
  System . out . println ( ans ) ;
}
