public static void input ( Scanner s ) {
  String [ ] moji = {
    "Mi" , "Fa" , "" , "So" , "" , "La" , "" , "Si" , "Do" , "" , "Re" , "" , "Mi" , "Fa" , "" , "So" , "" , "La" , "" , "Si" , "Do" , "" , "Re" , "" , "Mi" }
    . clone ( ) ;
    String [ ] moji2 = {
      "Mi" , "Fa" , "" , "So" , "" , "La" , "" , "Si" , "Do" , "" , "Re" , "" , "Mi" }
      . clone ( ) ;
      for ( int i = 0 ;
      i < 11 ;
      i ++ ) {
        if ( s . charAt ( i ) == 'W' && s . charAt ( i + 1 ) == 'W' && s . charAt ( i + 7 ) == 'W' && s . charAt ( i + 8 ) == 'W' ) {
          System . out . println ( moji [ i ] ) ;
          exit ( ) ;
        }
      }
      for ( int i = 0 ;
      i < 13 ;
      i ++ ) {
        if ( s . charAt ( i ) == 'W' && s . charAt ( i + 1 ) == 'W' && s . charAt ( i + 5 ) == 'W' && s . charAt ( i + 6 ) == 'W' ) {
          System . out . println ( moji2 [ i ] ) ;
          exit ( ) ;
        }
      }
    }
    