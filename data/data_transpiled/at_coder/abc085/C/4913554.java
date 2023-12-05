public static int N = Integer . parseInt ( input ) {
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int x = 0 ;
  x < N + 1 ;
  x ++ ) {
    for ( int y = 0 ;
    y < N + 1 ;
    y ++ ) {
      if ( Y == 10000 * x + 5000 * y + 1000 * ( N - x - y ) && N - x - y >= 0 ) {
        System . out . println ( x + " " + y + " " + N - x - y ) ;
        break ;
      }
    }
    else {
      continue ;
    }
    break ;
  }
  else {
    System . out . println ( "-1 -1 -1" ) ;
  }
  return Y ;
}
