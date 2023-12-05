public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input ) ;
  int z = Math . abs ( Math . abs ( x - y ) ) ;
  if ( z == 0 ) System . out . println ( 1 ) ;
  else if ( Math . abs ( x ) > Math . abs ( y ) ) {
    if ( x > 0 && y > 0 ) System . out . println ( z + 2 ) ;
    else if ( ( x == 0 && y > 0 ) || ( x < 0 && y == 0 ) || ( x < 0 && y < 0 ) ) System . out . println ( z ) ;
    else System . out . println ( z + 1 ) ;
  }
  else {
    if ( x < 0 && y < 0 ) System . out . println ( z + 2 ) ;
    else if ( ( x == 0 && y > 0 ) || ( x < 0 && y == 0 ) || ( x > 0 && y < 0 ) ) System . out . println ( z ) ;
    else System . out . println ( z + 1 ) ;
  }
  return z ;
}
