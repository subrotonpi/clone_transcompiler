public static int sumSqr ( int n , int base ) throws Exception {
  int res = 0 ;
  while ( n > 0 ) {
    int k = n % base ;
    n = ( n - k ) / base ;
    res += k * k ;
  }
  return res ;
}
