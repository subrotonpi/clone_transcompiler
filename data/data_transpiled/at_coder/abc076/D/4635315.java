@ VisibleForTesting static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > T = Lists . newArrayList ( ) ;
  final List < Integer > V_limit = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    V . add ( V_limit . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    V . add ( V_limit . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    V . add ( V_limit . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    V . set ( i , Math . min ( V . get ( i ) , V . get ( i + 1 ) ) ) ;
  }
  final int [ ] array = new int [ N ] ;
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    array [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    array [ V . size ( ) - 1 ] = Math . min ( V . get ( i ) + 0.5 , V . get ( i + 1 ) ) ;
  }
  for ( int i = V . size ( ) - 1 ;
  i > 0 ;
  i -- ) {
    array [ V . size ( ) - 1 ] = Math . min ( V . get ( i ) + 0.5 , V . get ( i - 1 ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < V . size ( ) - 1 ;
  i ++ ) {
    ans += 0.25 * ( array [ i ] + array [ i + 1 ] ) ;
  }
  System . out . println ( ans ) ;
}
