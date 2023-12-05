public static int N = Integer . parseInt ( input ) {
  int X = 0 , Y = 0 ;
  int flag = 0 ;
  for ( int x = 0 ;
  x < N + 1 ;
  x ++ ) {
    for ( int y = 0 ;
    y < N + 1 ;
    y ++ ) {
      if ( x + y > N ) {
      }
      else {
        int z = N - ( x + y ) ;
        if ( 10000 * x + 5000 * y + 1000 * z == Y ) {
          flag = 1 ;
          X = x ;
          Y = y ;
          Z = z ;
          break ;
        }
      }
    }
    if ( flag == 1 ) {
      break ;
    }
  }
  if ( flag == 0 ) {
    System . out . println ( - 1 , - 1 , - 1 , - 1 ) ;
  }
  else {
    System . out . println ( X + "," + Y + "," + Z ) ;
  }
  return X ;
}
