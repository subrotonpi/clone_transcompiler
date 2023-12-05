@ VisibleForTesting static List < Integer > readln ( String ch ) {
  java . util . List < Integer > res = Lists . newArrayList ( ) ;
  for ( String s : input . split ( ch ) ) {
    res . add ( Integer . parseInt ( s ) ) ;
  }
  return res ;
  /* count the odd number of integers */
  int odd = 0 , even = 0 ;
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    if ( a [ i ] % 2 == 1 ) odd = odd + 1 ;
    else even = even + 1 ;
  }
  /* deal n */
  int n = res . size ( ) ;
  int odd = res . size ( ) ;
  int even = res . size ( ) ;
  if ( even == 0 ) return false ;
  if ( even % 2 == 1 ) return true ;
  if ( odd > 1 ) return false ;
  int res ;
  if ( res . size ( ) % 2 == 0 ) {
    res = res . get ( 0 ) ;
  }
  else {
    res = res . get ( 1 ) ;
  }
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( res . size ( ) % 2 == 1 ) {
      if ( res . get ( i ) == 1 ) return false ;
      res . set ( i , res . get ( i ) - 1 ) ;
    }
    res = gcd ( res . get ( i ) , res ) ;
  }
  return ! deal ( n , Lists . newArrayList ( res ) ) ;
}
