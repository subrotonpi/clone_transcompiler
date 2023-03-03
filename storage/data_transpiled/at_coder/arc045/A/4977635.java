public static String [ ] getStrings ( ) {
  String s = list ( input . nextLine ( ) . split ( " " ) ) ;
  String t = {
    "Left" : "<" , "Right" : ">" , "AtCoder" : "A" }
    ;
    String [ ] ans = new String [ s . length ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      ans [ i ] = t . get ( s [ i ] ) ;
    }
    return ans ;
  }
  