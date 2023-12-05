public static void input ( ) {
  String s = input . nextLine ( ) ;
  String [ ] vowelArray = {
    "a" , "e" , "i" , "o" , "u" }
    ;
    if ( vowelArray [ s . indexOf ( "a" ) ] . equals ( s ) ) {
      System . out . println ( "vowel" ) ;
    }
    else {
      System . out . println ( "consonant" ) ;
    }
  }
  