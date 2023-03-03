public static void print ( int a , int b ) {
  String d = ".#" ;
  String s = ".#" ;
  System . out . println ( 100 + " " + 100 ) ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    if ( i < 50 ) {
      if ( i % 2 == 0 ) {
        if ( d . length ( ) > 0 ) {
          if ( d . length ( ) > 99 ) {
            System . out . println ( d . substring ( 0 , 100 ) ) ;
            d = d . substring ( 100 ) ;
          }
          else {
            System . out . println ( d + "#" ) ;
            d = "" ;
          }
        }
        else {
          System . out . println ( "#" ) ;
        }
      }
      else {
        System . out . println ( "#" ) ;
      }
    }
    else {
      if ( i % 2 == 1 ) {
        if ( s . length ( ) > 0 ) {
          if ( s . length ( ) > 99 ) {
            System . out . println ( s . substring ( 0 , 100 ) ) ;
            s = s . substring ( 100 ) ;
          }
          else {
            System . out . println ( s + "." ) ;
            s = "" ;
          }
        }
        else {
          System . out . println ( "." ) ;
        }
      }
      else {
        System . out . println ( "." ) ;
      }
    }
  }
}
