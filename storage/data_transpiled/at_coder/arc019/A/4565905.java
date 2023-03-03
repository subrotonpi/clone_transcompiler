public static String input ( ) {
  String s = input ( ) ;
  String c = "" ;
  String [ ] d = {
    "O" , "D" , "I" , "Z" , "S" , "B" }
    ;
    int [ ] e = {
      0 , 0 , 1 , 2 , 5 , 8 }
      ;
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        if ( d [ i ] != s . charAt ( i ) ) {
          c += e [ d [ i ] ] ;
        }
        else {
          c += s . charAt ( i ) ;
        }
      }
      System . out . println ( c ) ;
      return c ;
    }
    