static final String solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map [ ] DP = new Map [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    DP [ i ] = new TreeMap < Integer , Integer > ( ) ;
  }
  DP [ 0 ] . put ( 0 , 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int w = Integer . parseInt ( input . nextLine ( ) ) ;
    final int v = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int DPw : DP [ i ] . keySet ( ) ) {
      final int DPv = DP [ i ] . get ( DPw ) ;
      DP [ i + 1 ] . put ( DPw , Math . max ( DP [ i + 1 ] . get ( DPw ) , DPv ) ) ;
      if ( DPw + w <= W ) {
        DP [ i + 1 ] . put ( DPw + w , Math . max ( DP [ i + 1 ] . get ( DPw ) , DPv + v ) ) ;
      }
    }
  }
  System . out . println ( max ( DP [ N ] . values ( ) ) - 1 ) ;
}
