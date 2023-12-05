public static int input ( ) {
  String s = input ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      System . out . println ( i + 1 + " " + s . charAt ( i + 2 ) ) ;
      break ;
    }
    if ( i + 2 < s . length ( ) ) {
      if ( s . charAt ( i ) == s . charAt ( i + 2 ) ) {
        System . out . println ( i + 1 + " " + s . charAt ( i + 3 ) ) ;
        break ;
      }
    }
  }
  else {
    System . out . println ( - 1 + " " + - 1 ) ;
  }
  return - 1 ;
}
