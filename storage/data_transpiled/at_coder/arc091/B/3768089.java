public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int sub = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int s = n / i ;
    sub += s * ( Math . min ( i , k ) ) ;
    sub += Math . min ( n % i , Math . max ( 0 , k - 1 ) ) ;
  }
  System . out . println ( n * n - sub ) ;
}
