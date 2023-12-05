public static int [ ] getOne ( String input , int x , int y ) {
  int [ ] l1 = {
    1 , 3 , 5 , 7 , 8 , 10 , 12 }
    ;
    int [ ] l2 = {
      4 , 6 , 9 , 11 }
      ;
      int [ ] l3 = {
        2 }
        ;
        if ( l1 [ x ] >= 0 && l1 [ y ] >= 0 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( l2 [ x ] >= 0 && l2 [ y ] >= 0 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( l3 [ x ] >= 0 && l3 [ y ] >= 0 ) {
          System . out . println ( "Yes" ) ;
        }
        else {
          System . out . println ( "No" ) ;
        }
        return l1 ;
      }
      