public static void main ( String input , int n , int a , int b ) {
  String [ ] [ ] m = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m [ i ] = new String [ n ] ;
  }
  int p = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( m [ i ] [ 0 ] . equals ( "West" ) ) {
      if ( Integer . parseInt ( m [ i ] [ 1 ] ) < a ) p += a ;
      else if ( Integer . parseInt ( m [ i ] [ 1 ] ) > b ) p += b ;
      else p += Integer . parseInt ( m [ i ] [ 1 ] ) ;
    }
    if ( m [ i ] [ 0 ] . equals ( "East" ) ) {
      if ( Integer . parseInt ( m [ i ] [ 1 ] ) < a ) p -= a ;
      else if ( Integer . parseInt ( m [ i ] [ 1 ] ) > b ) p -= b ;
      else p -= Integer . parseInt ( m [ i ] [ 1 ] ) ;
    }
  }
  if ( p > 0 ) System . out . println ( "West" + p ) ;
  else if ( p < 0 ) System . out . println ( "East" + - p ) ;
  else System . out . println ( 0 ) ;
}
