public static void print ( String input ) {
  int ar = input . nextInt ( ) ;
  int b = 0 ;
  while ( true ) {
    int count = 0 ;
    for ( int i = 1 ;
    i < ar . length - 1 ;
    i ++ ) {
      if ( ar . charAt ( i - 1 ) != ar . charAt ( i + 1 ) ) {
        count ++ ;
        ar . remove ( i ) ;
        b ++ ;
        break ;
      }
    }
    if ( count == 0 ) {
      if ( b % 2 == 1 ) {
        System . out . println ( "First" ) ;
      }
      else {
        System . out . println ( "Second" ) ;
      }
      break ;
    }
  }
}
