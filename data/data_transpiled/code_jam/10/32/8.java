public static int T = Integer . parseInt ( readLine ( ) ) {
  final int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testCase : xrange ( 1 , T + 1 ) ) {
    final int L = Integer . parseInt ( readLine ( ) ) ;
    final int P = Integer . parseInt ( readLine ( ) ) ;
    final int C = Integer . parseInt ( readLine ( ) ) ;
    final int target = ( int ) Math . ceil ( ( double ) P / L ) ;
    int ans = 0 ;
    int num = C ;
    while ( target > num ) {
      ans ++ ;
      num *= num ;
    }
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return T ;
}
