public static int [ ] [ ] x , int [ ] y = new int [ 3 ] [ 3 ] ;
int x = 0 , y = 0 ;
if ( Math . abs ( x ) == Math . abs ( y ) ) {
  System . out . println ( 1 ) ;
}
else if ( Math . abs ( x ) < Math . abs ( y ) ) {
  if ( y > 0 ) {
    if ( x >= 0 ) {
      System . out . println ( Math . abs ( y ) - Math . abs ( x ) ) ;
    }
    else {
      System . out . println ( Math . abs ( y ) - Math . abs ( x ) + 1 ) ;
    }
  }
  else {
    if ( x >= 0 ) {
      System . out . println ( Math . abs ( y ) - Math . abs ( x ) + 1 ) ;
    }
    else {
      System . out . println ( Math . abs ( y ) - Math . abs ( x ) + 2 ) ;
    }
  }
}
else {
  if ( x < 0 ) {
    if ( y <= 0 ) {
      System . out . println ( Math . abs ( x ) - Math . abs ( y ) ) ;
    }
    else {
      System . out . println ( Math . abs ( x ) - Math . abs ( y ) + 1 ) ;
    }
  }
  else {
    if ( y <= 0 ) {
      System . out . println ( Math . abs ( x ) - Math . abs ( y ) + 1 ) ;
    }
    else {
      System . out . println ( Math . abs ( x ) - Math . abs ( y ) + 2 ) ;
    }
  }
}
