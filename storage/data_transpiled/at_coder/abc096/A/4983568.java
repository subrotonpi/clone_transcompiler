public static void main ( String input ) {
  int m , d = map ( Integer . parseInt ( input ) , 0 ) ;
  int res = 0 ;
  if ( m <= d ) {
    res = m ;
  }
  else {
    res = m - 1 ;
  }
  System . out . println ( res ) ;
}
