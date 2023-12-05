public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int day = 0 ;
  if ( K != 0 ) {
    while ( A < 2 * ( 10 * 12 ) ) {
      A = 1 + ( K + 1 ) * A ;
      day ++ ;
    }
    System . out . println ( day ) ;
  }
  else {
    System . out . println ( ( int ) ( 2 * ( 10 * 12 ) - A ) ) ;
  }
  return day ;
}
