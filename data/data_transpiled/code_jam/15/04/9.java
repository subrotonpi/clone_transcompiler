public static boolean ok ( int x , int r , int c ) {
  if ( r < c ) {
    r = c ;
    c = r ;
  }
  if ( x >= 7 ) {
    return false ;
  }
  if ( x == 1 ) {
    return true ;
  }
  if ( ( r * c ) % x != 0 ) {
    return false ;
  }
  if ( r < x ) {
    return false ;
  }
  if ( c < ( x + 1 ) / 2 ) {
    return false ;
  }
  if ( x == 2 ) {
    return true ;
  }
  if ( x == 3 ) {
    return true ;
  }
  if ( x == 4 ) {
    if ( c == 2 ) {
      return false ;
    }
    return true ;
  }
  if ( x == 5 ) {
    if ( ( r = ( r = ( c = ( c = ( c = ( c = ( c = ( c = ( c = ( c = ( c = ( c ) ) ) ) ) ) ) ) ) ) ) == ( 5 ) ) ) {
      return false ;
    }
    return true ;
  }
  if ( x == 6 ) {
    if ( c == 3 ) {
      return false ;
    }
    return true ;
  }
  int tnum = Integer . parseInt ( readLine ( ) ) ;
  for ( int test = 0 ;
  test < tnum ;
  test ++ ) {
    x = Integer . parseInt ( readLine ( ) ) ;
    r = Integer . parseInt ( readLine ( ) ) ;
    c = Integer . parseInt ( readLine ( ) ) ;
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ( ok ( x , r , c ) ? "GABRIEL" : "RICHARD" ) ) ;
  }
  return false ;
}
