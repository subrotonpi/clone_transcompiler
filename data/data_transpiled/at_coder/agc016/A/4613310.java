public static void main ( String input ) {
  L = new String [ ] {
    chr ( 97 ) , chr ( 123 ) }
    ;
    LinkedList < String > s = new LinkedList < String > ( ) ;
    s . add ( input ) ;
    int N = s . size ( ) ;
    double ans = Double . MAX_VALUE ;
    for ( int i = 0 ;
    i < L ;
    i ++ ) {
      int c = 0 ;
      LinkedList < String > X = s ;
      do {
        if ( X . indexOf ( i ) == N - c ) {
          break ;
        }
        else {
          LinkedList < String > Y = new LinkedList < String > ( ) ;
          for ( int j = 0 ;
          j < N - c - 1 ;
          j ++ ) {
            if ( X . get ( j ) == i || X . get ( j + 1 ) == i ) {
              Y . add ( i ) ;
            }
            else {
              Y . add ( "." ) ;
            }
          }
          X = Y ;
        }
        c ++ ;
      }
      while ( c < ans ) ;
    }
    System . out . println ( ans ) ;
  }
  