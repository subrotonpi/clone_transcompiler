public static int [ ] [ ] x , y = Integer [ ] [ ] y . split ( " " ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] map = {
    1 , 3 , 5 , 7 , 8 , 10 , 12 , 0 , 4 , 1 , 6 , 1 , 9 , 1 , 11 , 1 , 2 , }
    ;
    if ( map [ x ] == map [ y ] ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
    return map ;
  }
  