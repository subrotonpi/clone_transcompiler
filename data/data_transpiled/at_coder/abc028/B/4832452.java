private static void print ( String str ) {
  char [ ] moji = {
    'A' , 'B' , 'C' , 'D' , 'E' , 'F' }
    ;
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) {
      System . out . print ( str . indexOf ( moji [ i ] ) ) ;
      if ( i < 5 ) {
        System . out . print ( ' ' ) ;
      }
    }
    System . out . println ( ) ;
  }
  