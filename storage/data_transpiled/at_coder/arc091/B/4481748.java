public static void print ( int n , int k ) {
  int a = ( n - k ) * ( n - k + 1 ) / 2 ;
  for ( int i = k + 1 ;
  i < n ;
  i ++ ) {
    int j = n / i * i ;
    a += ( j / i - 1 ) * ( i - k ) + Math . max ( n - j + 1 - Math . max ( k , 1 ) , 0 ) ;
  }
  System . out . println ( a ) ;
}
