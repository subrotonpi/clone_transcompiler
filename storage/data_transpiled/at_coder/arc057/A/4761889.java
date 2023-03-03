public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  if ( K > 0 ) {
    while ( A < 2 * 10 * 12 ) {
      A ++ + K * A ;
      cnt ++ ;
    }
  }
  else {
    cnt = 2 * 10 * 12 - A ;
  }
  return cnt ;
}
