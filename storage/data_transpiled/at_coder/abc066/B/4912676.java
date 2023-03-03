public static String input ( ) {
  String S = input ( ) ;
  while ( true ) {
    S = S . substring ( 0 , S . length ( ) - 2 ) ;
    int l = S . length ( ) / 2 ;
    if ( S . regionMatches ( 0 , l , S , l , l ) ) {
      System . out . println ( l * 2 ) ;
      break ;
    }
  }
}
