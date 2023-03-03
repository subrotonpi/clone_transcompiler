public static int calc ( int [ ] al , int n ) {
  int res = 0 ;
  int r = 0 ;
  int tmpsum = 0 ;
  int tmpxor = 0 ;
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    while ( r < n && tmpsum + al [ r ] == tmpxor ^ al [ r ] ) {
      tmpsum += al [ r ] ;
      tmpxor ^= al [ r ] ;
      r ++ ;
    }
    res += ( r - l ) ;
    if ( r == l ) r ++ ;
    else {
      tmpsum -= al [ l ] ;
      tmpxor ^= al [ l ] ;
    }
  }
  return res ;
}
