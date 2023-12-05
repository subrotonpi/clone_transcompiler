static final Scanner input = new Scanner ( System . in ) {
  final Supplier < List < Integer >> ints = ( ) -> Collections . emptyList ( ) ;
  for ( int t = 0 ;
  t < Integer . parseInt ( input . nextLine ( ) ) ;
  t ++ ) {
    final int n = ints . get ( ) ;
    final int k = ints . get ( ) ;
    final List < Integer > rhs = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      rhs . add ( ints . get ( ) ) ;
    }
    final double ans = Math . max ( Math . PI * ri * ri + 2 * Math . PI * ri * hi + Ints . stream ( rhs . size ( ) ) . reduce ( ( i , ri , hi ) -> 2 * Math . PI * rj * hj ) . sum ( ) , k - 1 ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return new Scanner ( System . in ) ;
}
