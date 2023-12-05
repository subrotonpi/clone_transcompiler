@ VisibleForTesting static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  {
    final int N = Integer . parseInt ( input [ 0 ] ) ;
    final List < Integer > A_list = Lists . newArrayList ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      A_list . add ( Integer . parseInt ( input [ i ] ) ) ;
    }
    if ( A_list . get ( 0 ) != 0 || A_list . size ( ) >= 2 ) {
      System . out . println ( 0 ) ;
      return ;
    }
    final Counter < Integer > c = new Counter < > ( A_list ) ;
    BigInteger ans = BigInteger . ONE ;
    int pre = BigInteger . ONE ;
    for ( int length = 1 ;
    length <= Math . max ( A_list . size ( ) , N ) ;
    length ++ ) {
      final int v = c . getValue ( length ) ;
      if ( v == 0 ) {
        System . out . println ( 0 ) ;
        return ;
      }
      ans = ( ans . multiply ( BigInteger . valueOf ( 2 ) ) . pow ( ( v * ( v - 1 ) / 2 ) ) ) . mod ( MOD ) ;
      ans = ( ans . multiply ( BigInteger . valueOf ( 2 * pre - 1 ) ) . pow ( v , MOD ) ) . mod ( MOD ) ;
      pre = v ;
    }
    System . out . println ( ans . mod ( MOD ) ) ;
  }
}
