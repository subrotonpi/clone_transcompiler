public static int [ ] [ ] getPoints ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 ;
  int b = R + 1 ;
  while ( b - a > 1 ) {
    int c = ( a + b ) / 2 ;
    if ( R - c < 0 || B - c < 0 || ( R - c ) / ( x - 1 ) + ( B - c ) / ( y - 1 ) < c ) {
      b = c ;
    }
    else {
      a = c ;
    }
  }
  return new int [ ] [ ] {
  }
  ;
}
