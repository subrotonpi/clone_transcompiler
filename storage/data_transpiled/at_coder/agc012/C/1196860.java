public static int nCr ( int a , int b ) {
  int tmp = 1 ;
  for ( int i = a ;
  i > a - b ;
  i -- ) tmp *= i ;
  for ( int i = 1 ;
  i <= b ;
  i += 1 ) tmp /= i ;
  return tmp ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] out = new int [ n ] ;
int co = 1 ;
int coo = 0 ;
while ( n > 0 ) {
  int t = 2 ;
  int sum1 ;
  int tob ;
  int CO ;
  int rco = 0 ;
  int [ ] ad = new int [ t ] ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) ad [ i ] = co ;
  sum1 = rco ;
  ma = sum1 ;
  for ( int toa = 1 ;
  toa <= 4 ;
  toa ++ ) for ( int tob = 1 ;
  tob <= 4 ;
  tob ++ ) {
    CO = 0 ;
    for ( int r = 1 ;
    r <= Math . min ( toa , tob ) ;
    r ++ ) CO += nCr ( toa , r ) * nCr ( tob , r ) ;
    for ( int a = 1 ;
    a < t ;
    a ++ ) {
      int sum2 = sum1 + ( ( 2 * ( toa + tob - 1 ) ) - 1 ) ;
      for ( int b = 1 ;
      b <= a ;
      b ++ ) sum2 += nCr ( a , b ) * nCr ( t - a , b ) * CO ;
      if ( sum2 > n ) continue ;
      if ( ma < sum2 ) {
        ma = sum2 ;
        ad = new int [ a ] ;
        for ( int i = 0 ;
        i < a ;
        i ++ ) ad [ i ] = co ;
        for ( int i = 0 ;
        i < tob ;
        i ++ ) ad [ i ] = 100 - coo ;
      }
    }
  }
  for ( int t : ad ) out [ t ] = t ;
  n -= ma ;
  coo ++ ;
  co ++ ;
}
System . out . println ( out . length ) ;
System . out . println ( ( int [ ] ) out ) ;
return 0 ;
}
