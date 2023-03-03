@ Function public static int [ ] trialDivision ( int n ) {
  int [ ] a = new int [ 3 ] ;
  while ( n % 2 == 0 ) {
    a [ 0 ] = 2 ;
    n /= 2 ;
  }
  int f = 3 ;
  while ( f * f <= n ) {
    if ( n % f == 0 ) {
      a [ 0 ] = f ;
      n /= f ;
    }
    else f += 2 ;
  }
  if ( n != 1 ) a [ 0 ] = n ;
  return a ;
}
