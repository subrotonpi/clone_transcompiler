static final double [ ] range ( int i , int j ) {
  final int NCASE = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= NCASE ;
  testCase ++ ) {
    final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] SUM = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] A = new int [ N ] ;
    final int [ ] mxd = new int [ K ] , mnd = new int [ K ] ;
    for ( int i : xrange ( 0 , SUM . length - 1 ) ) {
      final int d = SUM [ i + 1 ] - SUM [ i ] ;
      A [ i + K ] = A [ i ] + d ;
      final int k = i % K ;
      mxd [ k ] = Math . max ( A [ i + K ] , mxd [ k ] ) ;
      mnd [ k ] = Math . min ( A [ i + K ] , mnd [ k ] ) ;
    }
    final int mxrng = Math . max ( mxd [ i ] - mnd [ i ] , 0 ) ;
    final int r = ( int ) i ;
    final int smn = Math . min ( mnd [ r ] , 0 ) ;
    final int smx = Math . min ( mxd [ r ] , 0 ) ;
    final int ans ;
    if ( ( SUM [ 0 ] - smn ) % K <= smx - smn ) ans = mxrng ;
    else ans = mxrng + 1 ;
    System . out . printf ( "Case #%d: %d%n" , testCase , ans ) ;
  }
  return new double [ ] {
  }
  ;
}
