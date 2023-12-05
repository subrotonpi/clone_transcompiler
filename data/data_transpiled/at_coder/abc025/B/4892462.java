public static int n ( String input ) {
  int c = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  String [ ] [ ] a = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new String [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( Integer . parseInt ( a [ j ] [ 1 ] ) < c ) {
        a [ j ] [ 1 ] = c ;
      }
      else if ( Integer . parseInt ( a [ j ] [ 1 ] ) > b ) {
        a [ j ] [ 1 ] = b ;
      }
    }
  }
  int ans = 0 ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( a [ k ] [ 0 ] . equals ( "East" ) ) {
      ans += Integer . parseInt ( a [ k ] [ 1 ] ) ;
    }
    else if ( a [ k ] [ 0 ] . equals ( "West" ) ) {
      ans -= Integer . parseInt ( a [ k ] [ 1 ] ) ;
    }
  }
  if ( ans > 0 ) {
    System . out . println ( "East" + ans ) ;
  }
  if ( ans == 0 ) {
    System . out . println ( 0 ) ;
  }
  if ( ans < 0 ) {
    System . out . println ( "West" + - ans ) ;
  }
  return ans ;
}
