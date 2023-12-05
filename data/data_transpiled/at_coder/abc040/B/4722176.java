public static int n ( ) {
  int n = input . nextInt ( ) ;
  int ans = 10 * * 18 ;
  for ( int i = 1 ;
  i <= 321 ;
  i ++ ) {
    if ( i * i > n ) break ;
    ans = Math . min ( ans , n / i - i + n % i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
