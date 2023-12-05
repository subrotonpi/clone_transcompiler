public static int a ( String input , int b ) {
  int cnt = 0 ;
  Set < Integer > Y = new HashSet < Integer > ( ) ;
  Y . add ( a ) ;
  int [ ] D = {
    1 , 5 , 10 , - 1 , - 5 , - 10 }
    ;
    while ( true ) {
      if ( Y . contains ( b ) ) {
        System . out . println ( cnt ) ;
        break ;
      }
      Set < Integer > X = Y ;
      cnt ++ ;
      Y = new HashSet < Integer > ( ) ;
      for ( int x : X ) {
        for ( int d : D ) {
          if ( - 10 < x + d < 50 ) {
            System . out . println ( x + d ) ;
          }
        }
      }
    }
    return cnt ;
  }
  