static final int [ ] sumDigits ( int n , int m ) {
  int r = 0 ;
  while ( n > 0 ) {
    r = r + n % m ;
    n = n / m ;
  }
  return r ;
}
