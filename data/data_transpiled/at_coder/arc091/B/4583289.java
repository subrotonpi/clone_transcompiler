public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int sum = 0 ;
  for ( int i = k + 1 ;
  i <= n ;
  i ++ ) {
    int x = n / i ;
    int y = n % i ;
    sum += x * ( i - k ) + Math . max ( y - k + 1 , 0 ) ;
  }
  if ( k > 0 ) {
    System . out . println ( sum ) ;
  }
  else {
    System . out . println ( sum - n ) ;
  }
}
