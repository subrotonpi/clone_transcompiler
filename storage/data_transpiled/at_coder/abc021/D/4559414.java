static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  /* if (n-r<r) r = n-r; if (r == 0) return 1; if (r == 1) return n; */
  int [ ] numerator = new int [ r ] ;
  int [ ] denominator = new int [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    numerator [ i ] = n - i + k + 1 ;
  }
  for ( int p = 2 ;
  p <= r ;
  p ++ ) {
    int pivot = denominator [ p - 1 ] ;
    if ( pivot > 1 ) {
      numerator [ k - offset ] /= pivot ;
      denominator [ k ] /= pivot ;
    }
  }
  int result = 1 ;
  for ( k = 0 ;
  k < r ;
  k ++ ) {
    if ( numerator [ k ] > 1 ) {
      result *= ( int ) numerator [ k ] ;
    }
  }
  return result ;
}
