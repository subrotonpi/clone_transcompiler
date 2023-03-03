public static int N = Integer . parseInt ( input ) {
  final int MOD = 10 * 9 + 7 ;
  final HashMap < Integer , Integer > memo = new HashMap < > ( ) ;
  int prevNum = 1 ;
  int prev = 0 ;
  for ( ;
  ;
  ) {
    final int c = Integer . parseInt ( input ) ;
    if ( c == prev ) {
      continue ;
    }
    int tmp = prevNum ;
    if ( c >= 0 ) {
      tmp += memo . get ( c ) ;
    }
    tmp %= MOD ;
    memo . put ( c , tmp ) ;
    prevNum = tmp ;
    prev = c ;
  }
  System . out . println ( prevNum ) ;
  return 0 ;
}
