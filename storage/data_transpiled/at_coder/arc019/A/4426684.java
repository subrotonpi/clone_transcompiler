public static void input ( ) {
  String s = input ( ) ;
  String [ ] l = {
    "O0" , "D0" , "I1" , "Z2" , "S5" , "B8" }
    ;
    for ( String [ ] c : l ) {
      s = s . replace ( c [ 0 ] , c [ 1 ] ) ;
    }
    System . out . println ( s ) ;
  }
  