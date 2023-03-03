public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] sosu = {
    2 , 3 , 5 , 7 }
    ;
    List A = new ArrayList ( ) ;
    int M = 11 ;
    while ( A . size ( ) < N ) {
      if ( Arrays . binarySearch ( sosu , M ) != 0 ) {
        sosu [ M ] = M ;
        if ( M % 5 == 1 ) A . add ( M ) ;
      }
      M += 2 ;
    }
    System . out . println ( A . toArray ( ) ) ;
  }
  