public static String S = input ( ) {
  for ( int i = 0 ;
  i < S . length ( ) / 2 ;
  i ++ ) {
    if ( S . charAt ( i ) == '*' || S . charAt ( S . length ( ) - ( i + 1 ) ) == '*' ) {
      continue ;
    }
    else if ( S . charAt ( i ) != S . charAt ( S . length ( ) - ( i + 1 ) ) ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  return S ;
}
