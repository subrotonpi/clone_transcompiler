public static int n ( ) {
  int ans = 10 * 5 ;
  for ( int a = 1 ;
  a <= n / 2 ;
  a ++ ) {
    int b = n - a ;
    ans = Math . min ( ans , a % 10 + a / 10 % 10 + a / 100 % 10 + a / 1000 % 10 + a / 10000 % 10 + b % 10 + b / 10 % 10 + b / 100 % 10 + b / 1000 % 10 + b / 10000 % 10 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
