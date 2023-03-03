@ VisibleForTesting static int [ ] ints ( Scanner input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( a ) ;
  int [ ] c = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( c . length > 2 || a [ 0 ] + 1 < a [ a . length - 1 ] ) System . out . println ( "No" ) ;
  else if ( c . length == 1 ) {
    if ( a [ 0 ] + 1 == n || n >= 2 * a [ 0 ] ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
  else {
    int x = c [ a . length - 1 ] ;
    int y = c [ a [ 0 ] ] ;
    if ( y + 1 <= a [ a . length - 1 ] && x <= a [ a . length - 1 ] / 2 + y ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
  return c ;
}
