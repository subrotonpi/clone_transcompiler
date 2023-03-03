public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int day = 0 ;
  if ( K == 0 ) {
    day = 2 * ( 10 * 12 ) - A ;
    System . out . println ( day ) ;
  }
  else {
    while ( A < 2 * ( 10 * 12 ) ) {
      A ++ + K * A ;
      day ++ ;
    }
    else System . out . println ( day ) ;
  }
  return day ;
}
