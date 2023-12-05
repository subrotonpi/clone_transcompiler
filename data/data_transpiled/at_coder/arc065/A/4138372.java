public static void input ( ) {
  String [ ] given = {
    "dream" , "dreamer" , "erase" , "eraser" }
    ;
    while ( true ) {
      if ( S . length ( ) == 0 ) {
        break ;
      }
      StringBuilder judge = new StringBuilder ( ) ;
      for ( int i = 0 ;
      i < given . length ;
      i ++ ) {
        judge . append ( S ) ;
      }
      if ( true ) {
        int index = judge . indexOf ( true ) ;
        int length = judge . length ( ) ;
        S = S . substring ( 0 , S . length ( ) - length ) ;
      }
      else {
        System . out . println ( "NO" ) ;
        quit ( ) ;
      }
    }
  }
  