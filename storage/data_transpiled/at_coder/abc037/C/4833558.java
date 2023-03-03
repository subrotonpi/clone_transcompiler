public static void input ( int n , int k ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( n + 1 >= 2 * k ) {
    for ( int i = 0 ;
    i < k - 1 ;
    i ++ ) ans += a [ i ] * ( i + 1 ) ;
    for ( int i = k - 1 ;
    i <= n - k ;
    i ++ ) ans += a [ i ] * k ;
    for ( int i = n - k + 1 ;
    i < n ;
    i ++ ) ans += a [ i ] * ( n - i ) ;
  }
  else {
    for ( int i = 0 ;
    i < n - k ;
    i ++ ) ans += a [ i ] * ( i + 1 ) ;
    for ( int i = n - k ;
    i < k ;
    i ++ ) ans += a [ i ] * ( n - k + 1 ) ;
    for ( int i = k ;
    i < n ;
    i ++ ) ans += a [ i ] * ( n - i ) ;
  }
  System . out . println ( ans ) ;
}
