public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  int [ ] num = {
    0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    int [ ] dp = new int [ N + 1 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      int now = - 10 * 9 ;
      for ( int aa : a ) {
        if ( i - num [ aa ] >= 0 ) {
          now = Math . max ( now , dp [ i - num [ aa ] ] + 1 ) ;
        }
      }
      dp [ i ] = now ;
    }
    StringBuffer answer = new StringBuffer ( ) ;
    for ( int i = 0 ;
    i < dp [ N - 1 ] ;
    i ++ ) {
      for ( int aa : a ) {
        if ( N >= num [ aa ] ) {
          if ( dp [ N - num [ aa ] ] == dp [ N ] - 1 ) {
            answer . append ( aa ) ;
            N -= num [ aa ] ;
            break ;
          }
        }
      }
    }
    System . out . println ( answer ) ;
  }
  