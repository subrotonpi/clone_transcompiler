public static int N = Integer . parseInt ( input ) {
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = false ;
  for ( int x = 0 ;
  x <= N ;
  x ++ ) {
    for ( int y = 0 ;
    y <= N ;
    y ++ ) {
      if ( x + y > N ) {
        break ;
      }
      int z = N - x - y ;
      if ( Y == 10000 * x + 5000 * y + 1000 * z ) {
        flag = true ;
      }
      if ( flag ) {
        break ;
      }
    }
    if ( flag ) {
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( x + " " + y + " " + z ) ;
  }
  else {
    System . out . println ( "-1 -1 -1" ) ;
  }
  return Y ;
}
