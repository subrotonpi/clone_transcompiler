public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 0 <= x && x <= y || x <= y && y <= 0 ) {
    System . out . println ( y - x ) ;
  }
  else if ( x <= 0 && y <= 0 && y <= x ) {
    System . out . println ( Math . abs ( Math . abs ( y ) - Math . abs ( x ) ) + 1 ) ;
  }
  else {
    System . out . println ( Math . abs ( Math . abs ( y ) - Math . abs ( x ) ) + 2 ) ;
  }
  return y ;
}
