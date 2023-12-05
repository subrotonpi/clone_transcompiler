public static int getDay ( ) {
  int A , K ;
  A = input . nextInt ( ) ;
  K = input . nextInt ( ) ;
  if ( K == 0 ) {
    System . out . println ( 2 * 10 * 12 - A ) ;
  }
  else {
    int day = 0 ;
    do {
      A ++ + K * A ;
      day = day + 1 ;
    }
    while ( A >= 2 * 10 * 12 ) ;
    System . out . println ( day ) ;
  }
  return day ;
}
