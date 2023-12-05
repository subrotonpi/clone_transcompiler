public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int testcase = 0 ;
  testcase < T ;
  testcase ++ ) {
    Arrays . stream ( readLine ( ) . split ( " " ) ) . forEach ( r -> {
      int c = Integer . parseInt ( readLine ( ) ) ;
      int w = Integer . parseInt ( readLine ( ) ) ;
      int answer = r * ( c / w ) + w - ( c % w == 0 ? 1 : 0 ) ;
      System . out . println ( "Case #" + ( testcase + 1 ) + ": " + answer ) ;
    }
    ) ;
  }
  return T ;
}
