static final void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] NNMSum = new int [ N ] ;
  final int [ ] NNSum = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    NNSum [ i ] = 0 ;
    NNMSum [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    NNSum [ i ] = NNSum [ i ] + Math . max ( 0 , A [ i + 1 ] ) ;
    NNMSum [ i + 1 ] = NNMSum [ i ] + Math . min ( 0 , A [ i + 1 ] ) ;
  }
  int ans = Math . max ( NNSum [ N - 1 ] - NNSum [ K - 1 ] , NNSum [ N - 1 ] + NNMSum [ K - 1 ] ) ;
  for ( int i = 1 ;
  i <= N - K ;
  ++ i ) {
    ans = Math . max ( ans , NNSum [ N - 1 ] - ( NNSum [ i + K - 1 ] - NNSum [ i - 1 ] ) , NNSum [ N - 1 ] - ( NNMSum [ i - 1 ] - NNMSum [ i + K - 1 ] ) ) ;
  }
  System . out . println ( ans ) ;
}
