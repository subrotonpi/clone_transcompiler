public static int A = Integer . parseInt ( input ) {
  int ans = 0 ;
  Set < Integer > Y = new HashSet < Integer > ( ) ;
  Y . add ( A ) ;
  int [ ] D = {
    1 , 5 , 10 , - 1 , - 5 , - 10 }
    ;
    while ( true ) {
      if ( Y . contains ( B ) ) {
        System . out . println ( ans ) ;
        break ;
      }
      Set < Integer > X = Y ;
      ans ++ ;
      Y = new HashSet < Integer > ( ) ;
      for ( int x : X ) {
        for ( int d : D ) {
          if ( - 10 < x + d < 50 ) {
            System . out . println ( x + d ) ;
          }
        }
      }
    }
    return ans ;
  }
  