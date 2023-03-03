static void print ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  final String S = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i <= S . length ( ) - 2 ) {
      if ( S . charAt ( i ) == S . charAt ( i + 1 ) ) {
        System . out . println ( i + 1 + " " + ( i + 2 ) ) ;
        break ;
      }
    }
    if ( i <= S . length ( ) - 3 ) {
      if ( S . charAt ( i ) == S . charAt ( i + 2 ) ) {
        System . out . println ( i + 1 + " " + ( i + 3 ) ) ;
        break ;
      }
    }
  }
  else {
    System . out . println ( "-1 -1" ) ;
  }
}
