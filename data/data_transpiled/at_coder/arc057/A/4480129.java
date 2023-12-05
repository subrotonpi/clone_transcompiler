public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K == 0 ) {
    System . out . println ( 2 * 10 * 12 - A ) ;
  }
  else {
    int cnt = 0 ;
    while ( A < 2 * 10 * 12 ) {
      cnt ++ ;
      A += A * K + 1 ;
    }
    System . out . println ( ( int ) cnt ) ;
  }
  return K ;
}
