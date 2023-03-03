public static int [ ] makeDivisors ( int N ) {
  int [ ] divisors = new int [ ( int ) ( N * 0.5 ) + 1 ] ;
  for ( int i = 1 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      divisors [ i ] = i ;
      if ( i != n / i ) {
        divisors [ i ] = n / i ;
      }
    }
  }
  int ans = 0 ;
  if ( N % 2 == 0 ) {
    for ( int j = 0 ;
    j < ( int ) ( N / 2 ) ;
    j ++ ) {
      int temp = makeDivisors ( 2 * j + 1 ) ;
      if ( temp == 8 ) ans ++ ;
    }
  }
  else {
    for ( int j = 0 ;
    j < ( int ) ( N / 2 ) + 1 ;
    j ++ ) {
      int temp = makeDivisors ( 2 * j + 1 ) ;
      if ( temp == 8 ) ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return divisors ;
}
