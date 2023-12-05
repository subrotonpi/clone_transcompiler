public static void input ( ) {
  String S = input ( ) ;
  String [ ] N = {
    '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' }
    ;
    StringBuilder id = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      if ( N [ i ] . equals ( S ) ) {
        id . append ( S . charAt ( i ) ) ;
      }
    }
    System . out . println ( id . toString ( ) ) ;
  }
  