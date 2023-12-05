public static int T = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int steps = 1 ;
    int current = 1 ;
    int L = String . valueOf ( N ) . length ( ) ;
    while ( String . valueOf ( current ) . length ( ) != String . valueOf ( N ) . length ( ) ) {
      int K = String . valueOf ( current ) . length ( ) ;
      if ( K == 1 ) {
        current = 10 ;
        steps = 10 ;
      }
      else {
        current = current * 10 ;
        steps += 10 * ( K / 2 ) + 10 * ( K - K / 2 ) - 1 ;
      }
    }
    if ( current != N && L > 1 && String . valueOf ( N ) . charAt ( N . length ( ) - 1 ) == '0' ) {
      N -- ;
      steps ++ ;
    }
    if ( L > 1 ) {
      String V = String . valueOf ( N ) . substring ( 0 , L / 2 ) ;
      V = V . substring ( 0 , V . length ( ) - 1 ) ;
      if ( Integer . parseInt ( V ) > 1 ) {
        steps += Integer . parseInt ( V ) + 1 ;
        current = Integer . parseInt ( V . substring ( 0 , V . length ( ) - 1 ) + '0' * ( L - L / 2 ) ) ;
        current ++ ;
      }
    }
    steps += N - current ;
    System . out . println ( "Case #" + t + ": " + steps ) ;
  }
  return T ;
}
