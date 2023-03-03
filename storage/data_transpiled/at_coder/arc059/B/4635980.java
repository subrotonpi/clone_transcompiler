public static void print ( String s ) {
  int N = s . length ( ) ;
  String judge = "balanced" ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      System . out . println ( i + 1 + " " + i + 2 ) ;
      judge = "unbalanced" ;
      break ;
    }
  }
  if ( judge . equals ( "balanced" ) ) {
    for ( int i = 0 ;
    i < N - 2 ;
    i ++ ) {
      if ( s . charAt ( i ) == s . charAt ( i + 2 ) ) {
        System . out . println ( i + 1 + " " + i + 3 ) ;
        judge = "unbalanced" ;
        break ;
      }
    }
  }
  if ( judge . equals ( "balanced" ) ) {
    System . out . println ( - 1 + " " + - 1 ) ;
  }
}
