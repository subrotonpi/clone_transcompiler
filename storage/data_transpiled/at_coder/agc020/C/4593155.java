@ InputFunction public static void input ( @ AggregationState HyperLogLogState state , @ AggregationState HyperLogLogState HyperLogLogState otherState ) {
  int N = state . getN ( ) ;
  HyperLogLogState [ ] A = HyperLogLogState . values ( ) ;
  for ( HyperLogLogState state : state . getConstrainedState ( ) ) {
    A [ state . getConstrainedState ( ) . size ( ) ] = state . getConstrainedState ( ) ;
  }
  boolean DP = true ;
  for ( HyperLogLogState state : A ) {
    DP |= DP << state . getConstrainedState ( ) ;
  }
  int Shalf = state . getConstrainedState ( ) . size ( ) ;
  DP >>= Shalf ;
  for ( int i = 0 ;
  i < N * Math . max ( A . length , 2 ) ;
  i ++ ) {
    if ( DP & 1 ) {
      System . out . println ( Shalf + state . getConstrainedState ( ) ) ;
      break ;
    }
    DP >>= 1 ;
  }
}
