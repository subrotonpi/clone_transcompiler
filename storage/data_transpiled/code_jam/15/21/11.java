@ VisibleForTesting static int solve ( String n , int d ) {
  if ( n . length ( ) == 1 ) {
    return Integer . parseInt ( n ) ;
  }
  int h = d / 2 ;
  int r = d - h ;
  if ( n . length ( ) > d ) {
    int res = solve ( n , d + 1 ) ;
    res += ( 10 * h ) + ( 10 * r ) - 1 ;
    return res ;
  }
  String s = n . substring ( 0 , h ) . substring ( 0 , n . length ( ) - 1 ) ;
  int t = Integer . parseInt ( s ) ;
  if ( n . length ( ) > h ) {
    s = Integer . parseInt ( n . substring ( 0 , h ) ) - 1 ;
    s = s . toString ( ) . substring ( 0 , s . length ( ) - 1 ) ;
    t = Integer . parseInt ( s ) ;
  }
  int res = t + 1 ;
  s = s . substring ( 0 , s . length ( ) - 1 ) + "0" + "1" ;
  res += Integer . parseInt ( n ) - Integer . parseInt ( s ) ;
  res = Math . min ( res , Integer . parseInt ( n ) - ( 10 * ( d - 1 ) ) ) ;
  return res ;
}
