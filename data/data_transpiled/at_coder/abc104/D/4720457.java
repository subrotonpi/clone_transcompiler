public static void input ( Scanner s ) {
  int [ ] [ ] dp = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    dp [ i ] [ 0 ] = 1 ;
  }
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( c == 'A' || c == '?' ) {
      dp [ 1 ] [ i + 1 ] = dp [ 0 ] [ i ] ;
    }
    if ( c == 'B' || c == '?' ) {
      dp [ 2 ] [ i + 1 ] = dp [ 1 ] [ i ] ;
    }
    if ( c == 'C' || c == '?' ) {
      dp [ 3 ] [ i + 1 ] = dp [ 2 ] [ i ] ;
    }
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( c == '?' ) {
        dp [ j ] [ i + 1 ] += dp [ j ] [ i ] * 3 ;
      }
      else {
        dp [ j ] [ i + 1 ] += dp [ j ] [ i ] ;
      }
      dp [ j ] [ i + 1 ] %= 10 * 9 + 7 ;
    }
  }
  System . out . println ( dp [ dp . length - 1 ] [ dp . length - 1 ] ) ;
}
