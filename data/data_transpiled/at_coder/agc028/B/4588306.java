static final int [ ] getSums ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] number = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) number [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] SUM = new int [ N + 1 ] ;
  int sum = 0 ;
  int p = 10 * 9 + 7 ;
  int x = Math . factorial ( N ) % p ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int k = Math . pow ( i , p - 2 , p ) ;
    sum += ( x * k ) % p ;
    sum = sum % p ;
    SUM [ i ] = sum ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += ( number [ i ] * ( SUM [ i ] + SUM [ N - i - 1 ] - x ) ) % p ;
    ans = ans % p ;
  }
  System . out . println ( ans ) ;
}
