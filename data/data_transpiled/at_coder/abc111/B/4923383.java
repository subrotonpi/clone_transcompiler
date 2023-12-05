public static int x = Integer . parseInt ( input ) {
  for ( int y = 1 ;
  y < 10 ;
  y ++ ) {
    if ( x <= y * 111 ) {
      System . out . println ( y * 111 ) ;
      break ;
    }
  }
  return y ;
}
