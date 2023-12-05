static final Scanner in = new Scanner ( System . in ) {
  private final int T = Integer . parseInt ( in . nextLine ( ) ) ;
  private final Map < Integer , Double > memo = Maps . newHashMap ( ) ;
  private final double owp ( int ind ) {
    if ( memo . containsKey ( ind ) ) {
      return memo . get ( ind ) ;
    }
    double sum = 0.0 ;
    int length = 0 ;
    for ( int i : xrange ( N ) ) {
      if ( mat [ ind ] [ i ] != '.' ) {
        sum += average ( i , ind ) ;
        length ++ ;
      }
    }
    memo . put ( ind , sum / length ) ;
    return sum / length ;
  }
  private final double average ( int ind , int exc ) {
    double sum = 0.0 ;
    int length = 0 ;
    for ( int i : xrange ( N ) ) {
      if ( i != exc && mat [ ind ] [ i ] != '.' ) {
        sum += ( int ) mat [ ind ] [ i ] ;
        length ++ ;
      }
    }
    return sum / length ;
  }
}
;
for ( int cas : xrange ( 1 , T + 1 ) ) {
  final int N = Integer . parseInt ( in . nextLine ( ) ) ;
  final Map < Integer , Double > memo = Maps . newHashMap ( ) ;
  final String [ ] mat = new String [ N ] ;
  for ( int i : xrange ( N ) ) {
    mat [ i ] = in . nextLine ( ) . trim ( ) ;
  }
  System . out . println ( "Case #" + cas + ":" ) ;
  for ( int i : xrange ( N ) ) {
    double ans = average ( i ) * 0.25 + 0.5 * owp ( i ) ;
    double oowp = 0 ;
    int length = 0 ;
    for ( int j : xrange ( N ) ) {
      if ( mat [ j ] [ i ] != '.' ) {
        oowp += owp ( j ) ;
        length ++ ;
      }
    }
    oowp /= length ;
    ans += oowp * 0.25 ;
    System . out . println ( ans ) ;
  }
}
