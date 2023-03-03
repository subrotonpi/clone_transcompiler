public static String input ( ) {
  int Slen = S . length ( ) ;
  int cnt = 0 ;
  int index = 0 ;
  if ( S . charAt ( 0 ) == 'B' ) {
    while ( index <= Slen - 2 ) {
      if ( S . charAt ( index ) == 'B' && S . charAt ( index + 1 ) == 'W' ) {
        cnt ++ ;
        index += 2 ;
      }
      else {
        index ++ ;
      }
    }
    if ( S . charAt ( S . length ( ) - 1 ) == 'W' ) {
      System . out . println ( String . valueOf ( cnt * 2 - 1 ) ) ;
    }
    else {
      System . out . println ( String . valueOf ( cnt * 2 ) ) ;
    }
  }
  else {
    while ( index <= Slen - 2 ) {
      if ( S . charAt ( index ) == 'W' && S . charAt ( index + 1 ) == 'B' ) {
        cnt ++ ;
        index += 2 ;
      }
      else {
        index ++ ;
      }
    }
    if ( S . charAt ( S . length ( ) - 1 ) == 'B' ) {
      System . out . println ( String . valueOf ( cnt * 2 - 1 ) ) ;
    }
    else {
      System . out . println ( String . valueOf ( cnt * 2 ) ) ;
    }
  }
  return "" ;
}
