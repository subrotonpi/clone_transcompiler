public static int [ ] getIntegerArray ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] g1 = {
    1 , 3 , 5 , 7 , 8 , 10 , 12 }
    ;
    int [ ] g2 = {
      4 , 6 , 9 , 11 }
      ;
      int [ ] g3 = {
        2 }
        ;
        if ( g1 [ a ] == 1 && g1 [ b ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( g2 [ a ] == 1 && g2 [ b ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( g3 [ a ] == 1 && g3 [ b ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else {
          System . out . println ( "No" ) ;
        }
        return g1 ;
      }
      