public static void Factorial ( int n , int mod ) {
  int [ ] f = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    f [ i ] = 1 ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    f [ i ] = Math . pow ( f [ i - 1 ] , mod - 2 , mod ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    i [ i ] = Math . pow ( i , n - 1 ) % mod ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    i [ i ] = Math . pow ( i , n - 1 ) % mod * i [ k ] ;
  }
  int mod = 10 * 9 + 7 ;
  int h = Integer . parseInt ( input ( ) ) ;
  int w = Integer . parseInt ( input ( ) ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  Factorial f = new Factorial ( h + w , mod ) ;
  int ans = 0 ;
  for ( int i = b ;
  i < w ;
  i ++ ) {
    ans = ( ans + f . comb ( h - a - 1 + i , i ) * f . comb ( a - 1 + w - i - 1 , w - i - 1 ) ) % mod ;
  }
  System . out . println ( ans ) ;
}
