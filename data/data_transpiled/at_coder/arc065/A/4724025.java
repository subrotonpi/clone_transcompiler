public static void input ( ) {
  Scanner s = new Scanner ( System . in ) ;
  int i = s . nextInt ( ) ;
  do {
    if ( i == 0 ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    if ( 6 < i && s . substring ( i - 7 , i ) . equals ( "dreamer" ) ) {
      i -= 7 ;
      continue ;
    }
    if ( 5 < i && s . substring ( i - 6 , i ) . equals ( "eraser" ) ) {
      i -= 6 ;
      continue ;
    }
    if ( 4 < i && s . substring ( i - 5 , i ) . equals ( "dream" ) || s . substring ( i - 5 , i ) . equals ( "erase" ) ) {
      i -= 5 ;
      continue ;
    }
    System . out . println ( "NO" ) ;
    break ;
  }
  while ( true ) ;
}
