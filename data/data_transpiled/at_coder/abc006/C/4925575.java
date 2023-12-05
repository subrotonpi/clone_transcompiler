public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( M / N > 4 || M / N < 2 ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
  else {
    int a = M - N * 3 ;
    if ( ( a < 0 ) || ( a > N ) ) {
      System . out . println ( - a + " " + a + N + " " + 0 ) ;
    }
    else {
      System . out . println ( 0 + N - a + " " + a ) ;
    }
  }
  return M ;
}
