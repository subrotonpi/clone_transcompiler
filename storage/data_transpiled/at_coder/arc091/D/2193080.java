static final int getSumOfDigits ( int input ) {
  System . setProperty ( "radix" , "" ) ;
  @ SuppressWarnings ( "unused" ) int a = input ;
  int k = input ;
  if ( a < k ) {
    return 0 ;
  }
  int d = a / k ;
  int m = a % k ;
  if ( m == 0 ) {
    return d ;
  }
  int d1 = d + 1 ;
  if ( d > k ) {
    return grundy ( a - d1 , k ) ;
  }
  int e = Math . ceil ( m / d1 ) * d1 ;
  return grundy ( a - e , k ) ;
}
