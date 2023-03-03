public static void print ( String s ) {
  String [ ] p = {
    "0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" }
    ;
    StringBuffer res = new StringBuffer ( ) ;
    for ( String e : s ) {
      if ( p [ e ] . contains ( p ) ) {
        res . append ( e ) ;
      }
    }
    System . out . println ( Integer . parseInt ( res . toString ( ) ) ) ;
  }
  