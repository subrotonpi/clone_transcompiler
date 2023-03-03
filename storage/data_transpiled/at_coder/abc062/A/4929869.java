public static int [ ] a ( ) {
  int [ ] a = {
    1 , 3 , 5 , 7 , 8 , 10 , 12 }
    ;
    int [ ] b = {
      4 , 6 , 9 , 11 }
      ;
      int [ ] ans = {
        0 , 0 }
        ;
        List < Integer > x = new LinkedList < Integer > ( ) ;
        for ( int i = 0 ;
        i < input . length ( ) ;
        i ++ ) {
          x . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
        }
        for ( int i = 0 ;
        i < x . size ( ) ;
        i ++ ) {
          int xi = x . get ( i ) ;
          if ( a [ xi ] == 1 ) {
            ans [ i ] = 1 ;
          }
          else if ( b [ xi ] == 1 ) {
            ans [ i ] = 2 ;
          }
        }
        if ( ans [ 0 ] == ans [ 1 ] ) {
          System . out . println ( "Yes" ) ;
        }
        else {
          System . out . println ( "No" ) ;
        }
        return ans ;
      }
      