private static int myWorst ( int n , int p ) {
  if ( p == 0 ) {
    return 0 ;
  }
  int p2 = Math . max ( 0 , ( p - 1 ) / 2 ) ;
  return myWorst ( n - 1 , p2 ) + ( 1 << ( n - 1 ) ) ;
  / * ▁ Best ▁ p ▁ = ▁ ( 1 << n ) - 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ - ▁ 1 ▁ -