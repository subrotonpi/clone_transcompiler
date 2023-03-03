public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  final int [ ] [ ] dp = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      dp [ i + 1 ] [ j ] = dp [ i ] [ j ] ;
      if ( 0 <= W - A [ i ] ) {
        dp [ i + 1 ] [ j ] [ A [ i ] ] = Math . max ( dp [ i ] [ j ] [ A [ i ] ] , dp [ i ] [ j - 1 ] [ W - A [ i ] + 1 ] + B [ i ] ) ;
      }
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    ans = ( int ) Math . max ( ans , dp [ N ] [ i ] [ W ] ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
