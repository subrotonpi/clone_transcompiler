public static String input ( ) {
  String s = input + "T" ;
  int goalX = Integer . parseInt ( input . substring ( 0 , 1 ) ) , goalY = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  int length = s . length ( ) ;
  int [ ] dp_x = new int [ length * 2 + 1 ] , dp_y = new int [ length * 2 + 1 ] ;
  int start = 0 ;
  int x_steps = s . indexOf ( "T" ) ;
  dp_x [ length + start ] = dp_y [ length ] = 1 ;
  int steps = 0 ;
  int y_steps = 0 ;
  int direction = 0 ;
  for ( int i = start ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( c == 'F' ) {
      steps ++ ;
    }
    else {
      if ( steps > 0 ) {
        int [ ] _dp = new int [ length * 2 + 1 ] ;
        if ( direction == 0 ) {
          for ( int x = length - x_steps ;
          x <= x_steps ;
          x ++ ) {
            if ( x > 0 ) {
              _dp [ x - steps ] = _dp [ x + steps ] = 1 ;
            }
          }
          x_steps += steps ;
          dp_x = _dp ;
        }
        else {
          for ( int y = length - y_steps ;
          y <= y_steps ;
          y ++ ) {
            if ( y > 0 ) {
              _dp [ y - steps ] = _dp [ y + steps ] = 1 ;
            }
          }
          y_steps += steps ;
          dp_y = _dp ;
        }
      }
      steps = 0 ;
      direction ^= 1 ;
    }
  }
  System . out . println ( dp_x [ length + goalX ] && dp_y [ length + goalY ] ) ;
  return s ;
}
