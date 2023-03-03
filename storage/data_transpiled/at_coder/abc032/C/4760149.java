public static int [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  if ( 0 == S . length ) {
    System . out . println ( N ) ;
    exit ( ) ;
  }
  int total = 1 ;
  int r = 0 ;
  int l = 0 ;
  int ans = 0 ;
  while ( total <= K && r < N ) {
    total *= S [ r ++ ] ;
    while ( total > K && l <= r ) {
      total /= S [ l ++ ] ;
    }
    ans = Math . max ( ans , r - l ) ;
  }
  return S ;
}
