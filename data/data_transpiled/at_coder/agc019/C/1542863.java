@ Sys public static int [ ] [ ] input ( ) {
  String input = System . getProperty ( "input" ) ;
  @ SuppressWarnings ( "unchecked" ) List < Integer > list = new ArrayList < Integer > ( ) ;
  /* LIS */
  int [ ] best = new int [ list . size ( ) ] ;
  for ( int i = 0 ;
  i < list . size ( ) ;
  i ++ ) {
    int pos = bl ( best , list . get ( i ) ) ;
    if ( best . length <= pos ) best [ pos ] = list . get ( i ) ;
    else best [ pos ] = list . get ( i ) ;
  }
  int xflip = 1 ;
  int yflip = 1 ;
  int x1 = Integer . parseInt ( input ) ;
  int y1 = Integer . parseInt ( input ) ;
  int x2 = Integer . parseInt ( input ) ;
  int y2 = Integer . parseInt ( input ) ;
  if ( x1 > x2 ) {
    xflip = - 1 ;
    x1 = x2 ;
    x2 = x1 ;
  }
  if ( y1 > y2 ) {
    yflip = - 1 ;
    y1 = y2 ;
    y2 = y1 ;
  }
  ArrayList < Point > points = new ArrayList < Point > ( ) ;
  for ( int i = 0 ;
  i < points . size ( ) ;
  i ++ ) points . add ( points . get ( i ) ) ;
  int foun = LIS ( points ) ;
  int dist = D ( 100 ) * ( x2 - x1 + y2 - y1 ) ;
  int dx = D ( "-4.2920367320510338076867835" ) * foun ;
  if ( foun == Math . min ( x2 - x1 + 1 , y2 - y1 + 1 ) ) dx += D ( "15.7079632679489661923132165" ) ;
  System . out . println ( dist + dx ) ;
  return best ;
}
