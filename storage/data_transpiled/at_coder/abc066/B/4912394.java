public static String S ( ) {
  if ( S . length ( ) % 2 == 1 ) {
    S = S . substring ( 0 , S . length ( ) - 1 ) ;
  }
  else {
    S = S . substring ( 0 , S . length ( ) - 2 ) ;
  }
  while ( true ) {
    if ( S . substring ( 0 , ( int ) ( S . length ( ) / 2 ) ) . equals ( S . substring ( ( int ) ( S . length ( ) / 2 ) , S . length ( ) ) ) ) {
      System . out . println ( S . length ( ) ) ;
      break ;
    }
    else {
      S = S . substring ( 0 , S . length ( ) - 2 ) ;
    }
  }
}
