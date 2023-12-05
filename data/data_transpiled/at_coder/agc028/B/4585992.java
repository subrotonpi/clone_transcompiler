static final int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] number = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) number [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] SUM = new int [ n ] ;
  int sum = 0 ;
  int p = 10 * 9 + 7 ;
  int x = Math . factorial ( n ) % ( 10 * 9 + 7 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int k = Math . pow ( i , p - 2 , p ) ;
    sum += ( x * k ) % p ;
    sum = sum % ( p ) ;
    SUM [ i ] = sum ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += number [ i ] * ( SUM [ n - 1 - i ] + SUM [ i ] - x ) ;
    ans = ans % ( p ) ;
  }
  System . out . println ( ans ) ;
  return SUM ;
}
