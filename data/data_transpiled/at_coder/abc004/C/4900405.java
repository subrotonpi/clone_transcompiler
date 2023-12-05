public static void print ( String input ) {
  int n = Integer . parseInt ( input ) % 30 ;
  char [ ] cards = {
    '1' , '2' , '3' , '4' , '5' , '6' }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      i = i % 5 ;
      cards [ i ] = cards [ i + 1 ] ;
    }
    System . out . println ( cards ) ;
  }
  