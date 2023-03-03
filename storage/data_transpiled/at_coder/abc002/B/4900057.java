public static void print ( String w ) {
  w = list ( input ( ) ) ;
  String [ ] a = {
    "a" , "i" , "u" , "e" , "o" }
    ;
    w = w . stream ( ) . filter ( w_ -> ! a [ w_ ] . equals ( w ) ) . collect ( Collectors . joining ( ) ) ;
    System . out . println ( "" . join ( w ) ) ;
  }
  