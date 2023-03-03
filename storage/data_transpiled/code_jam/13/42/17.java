@ Sys public static int from ( String in ) {
  int T = Integer . parseInt ( in ) ;
  for ( ;
  ;
  ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int P = Integer . parseInt ( in . nextLine ( ) ) ;
    int a , b ;
    if ( P == Math . pow ( 2 , N ) ) {
      a = Math . pow ( 2 , N ) - 1 ;
      b = a ;
    }
    else {
      int k = N ;
      while ( Math . pow ( 2 , N ) - Math . pow ( 2 , N - k ) >= P ) k -- ;
      a = 2 * ( Math . pow ( 2 , k ) - 1 ) ;
      k = N ;
      while ( Math . pow ( 2 , k ) - 1 >= P ) k -- ;
      b = Math . pow ( 2 , N ) - Math . pow ( 2 , N - k ) ;
    }
    System . out . printf ( "Case #%d: %d %d%n" , T , a , b ) ;
  }
}
