public static void input ( ) {
  S = input ( ) ;
  int countA = 0 ;
  int countC = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i == 0 ) {
      if ( S . charAt ( i ) != 'A' ) {
        System . out . println ( "WA" ) ;
        quit ( ) ;
      }
      else {
        countA ++ ;
        continue ;
      }
    }
    if ( S . charAt ( i ) == 'C' ) {
      if ( i < 2 || i == S . length ( ) - 1 ) {
        System . out . println ( "WA" ) ;
        quit ( ) ;
      }
    }
  }
  System . out . println ( "AC" ) ;
}
