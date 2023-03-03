public static void print ( String S ) {
  String T = input ( ) ;
  int pit = 0 ;
  int N = S . length ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) != T . charAt ( i ) ) {
      if ( S . charAt ( i ) == '@' ) {
        switch ( T . charAt ( i ) ) {
          case 'a' : case 't' : case 'c' : case 'o' : case 'd' : case 'e' : case 'r' : case '@' : pit = pit + 1 ;
          break ;
          default : System . out . println ( "You will lose" ) ;
          break ;
        }
      }
      else if ( T . charAt ( i ) == '@' ) {
        switch ( S . charAt ( i ) ) {
          case 'a' : case 't' : case 'c' : case 'o' : case 'd' : case 'e' : case 'r' : case '@' : pit = pit + 1 ;
          break ;
          default : System . out . println ( "You will lose" ) ;
          break ;
        }
      }
      else {
        System . out . println ( "You will lose" ) ;
        break ;
      }
    }
    else {
      pit = pit + 1 ;
    }
  }
  if ( pit == N ) {
    System . out . println ( "You can win" ) ;
  }
}
