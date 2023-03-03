static final String calc1 ( int [ ] a , int n ) throws IOException {
  int res = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( n % 2 == 1 ) {
      res += a [ i ] ;
    }
    n /= 2 ;
  }
  return res ;
}
