public static String [ ] cardsStr ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cards = {
    1 , 2 , 3 , 4 , 5 , 6 }
    ;
    if ( N >= 30 ) {
      N = N % 30 ;
    }
    for ( int i = 0 ;
    i < N / 5 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        int tmp = cards [ j ] ;
        cards [ j ] = cards [ j + 1 ] ;
        cards [ j + 1 ] = tmp ;
      }
    }
    String [ ] cardsStr = new String [ N ] ;
    return cardsStr ;
  }
  