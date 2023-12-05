@ VisibleForTesting static int max ( ) {
  final List < Integer > nml = Lists . newArrayList ( ) ;
  final List < Integer > pqro = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < nml . size ( ) ;
  ++ i ) {
    pqro . add ( i ) ;
  }
  final List < Integer > pqrs = Lists . newArrayList ( ) ;
  for ( final Integer pqr : pqro ) {
    final int num = Math . min ( nml . size ( ) , pqr ) ;
    ans = Math . max ( ans , num ) ;
  }
  return ans ;
}
