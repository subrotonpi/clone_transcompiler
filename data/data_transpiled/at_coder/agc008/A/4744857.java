public static int [ ] [ ] getNegativeInstances ( ) {
  int x = Integer . parseInt ( input . readLine ( ) ) , y = Integer . parseInt ( input . readLine ( ) ) ;
  if ( 0 < x && x < y ) {
    System . out . println ( y - x ) ;
  }
  else if ( x < 0 && 0 < y ) {
    if ( Math . abs ( x ) >= Math . abs ( y ) ) {
      System . out . println ( - x - y + 1 ) ;
    }
    else {
      System . out . println ( x + y + 1 ) ;
    }
  }
  else if ( y < 0 && 0 < x ) {
    if ( Math . abs ( x ) >= Math . abs ( y ) ) {
      System . out . println ( x + y + 1 ) ;
    }
    else {
      System . out . println ( - x - y + 1 ) ;
    }
  }
  else if ( 0 < y && y < x ) {
    System . out . println ( x - y + 2 ) ;
  }
  else if ( x < y && y < 0 ) {
    System . out . println ( y - x ) ;
  }
  else if ( y < x && x < 0 ) {
    System . out . println ( x - y + 2 ) ;
  }
  else if ( x == 0 ) {
    if ( y > 0 ) {
      System . out . println ( y ) ;
    }
    else {
      System . out . println ( - y + 1 ) ;
    }
  }
  else {
    if ( x > 0 ) {
      System . out . println ( x + 1 ) ;
    }
    else {
      System . out . println ( - x ) ;
    }
  }
  return new int [ ] [ ] {
    {
      x , y }
    }
    ;
  }
  