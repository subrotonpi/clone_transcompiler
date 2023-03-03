public static void input ( ) {
  Scanner S = new Scanner ( System . in ) ;
  int [ ] [ ] dp = new int [ 4 ] [ S . length ( ) + 10 ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  int mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( S . charAt ( i ) != '?' ) {
        dp [ i + 1 ] [ j ] += dp [ i ] [ j ] ;
        dp [ i + 1 ] [ j ] %= mod ;
      }
      else {
        dp [ i + 1 ] [ j ] += dp [ i ] [ j ] * 3 ;
        dp [ i + 1 ] [ j ] %= mod ;
      }
    }
    if ( S . charAt ( i ) == 'A' || S . charAt ( i ) == '?' ) {
      dp [ i + 1 ] [ 1 ] += dp [ i ] [ 0 ] ;
      dp [ i + 1 ] [ 1 ] %= mod ;
    }
    if ( S . charAt ( i ) == 'B' || S . charAt ( i ) == '?' ) {
      dp [ i + 1 ] [ 2 ] += dp [ i ] [ 1 ] ;
      dp [ i + 1 ] [ 2 ] %= mod ;
    }
  }
  System . out . println ( dp [ S . length ( ) ] [ 3 ] ) ;
}
