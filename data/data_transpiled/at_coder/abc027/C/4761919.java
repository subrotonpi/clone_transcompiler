public static String [ ] N ( int input ) {
  String [ ] ret = {
    "Aoki" , "Takahashi" }
    ;
    int point = 0 ;
    for ( int i = 1 ;
    i < N . length ;
    i ++ ) {
      if ( N [ i ] . equals ( "0" ) ) {
        if ( i % 2 != ( N . length - 1 ) % 2 ) {
          System . out . println ( ret [ i % 2 ] ) ;
          break ;
        }
      }
      if ( N [ i ] . equals ( "1" ) ) {
        if ( i % 2 == ( N . length - 1 ) % 2 ) {
          System . out . println ( ret [ i % 2 ] ) ;
          break ;
        }
      }
    }
    else {
      System . out . println ( ret [ ( N . length - 1 ) % 2 ] ) ;
    }
    return ret ;
  }
  