@ Nullable private static Double F = null ;
{
  if ( F != null ) return F . get ( s ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    String s_ = s . substring ( i ) + s . substring ( 0 , i ) ;
    if ( F != null ) return F . get ( s_ ) ;
  }
  Double ans = 0.0 ;
  if ( Arrays . binarySearch ( Collections . singletonList ( s ) , '.' ) == 0 ) {
    F . put ( s , ans ) ;
    return ans ;
  }
  String ts = s . substring ( 2 ) ;
  int dist = 0 ;
  int last = 2 * n ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    if ( ts . charAt ( i ) == '.' ) {
      dist = 0 ;
      last = i ;
    }
    else dist ++ ;
    if ( i < n ) {
      int ps = last < n ? last : last - n ;
      String ns = s . substring ( 0 , ps ) + 'X' + s . substring ( ps + 1 ) ;
      ans += n - ( last - i ) + F . f ( ns , n ) ;
    }
  }
  ans /= n ;
  F . put ( s , ans ) ;
  return ans ;
}
