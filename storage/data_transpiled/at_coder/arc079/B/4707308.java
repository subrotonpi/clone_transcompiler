public static int k = Integer . parseInt ( input ) {
  int n = 50 ;
  int tmp = k / 50 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = 49 + tmp ;
  }
  k %= 50 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int m = Math . min ( a ) ;
  }
  return m ;
}
