public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input ) ;
  if ( x == 0 && y > 0 ) {
    System . out . println ( y - x ) ;
  }
  else if ( x == 0 && y < 0 ) {
    System . out . println ( 1 + Math . abs ( x + y ) ) ;
  }
  else if ( y == 0 && x > 0 ) {
    System . out . println ( 1 + Math . abs ( x + y ) ) ;
  }
  else if ( y == 0 && x < 0 ) {
    System . out . println ( y - x ) ;
  }
  else if ( x < 0 && y < x ) {
    System . out . println ( 2 + Math . abs ( x - y ) ) ;
  }
  else if ( 0 < x && x < y ) {
    System . out . println ( y - x ) ;
  }
  else if ( 0 < y && x > y ) {
    System . out . println ( 2 + Math . abs ( x - y ) ) ;
  }
  else if ( 0 > y && x > y ) {
    System . out . println ( Math . abs ( y + x ) + 1 ) ;
  }
  else if ( x < 0 && y > 0 ) {
    System . out . println ( Math . abs ( y + x ) + 1 ) ;
  }
  else if ( y < 0 && x < y ) {
    System . out . println ( y - x ) ;
  }
  return y ;
}
