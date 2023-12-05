public static String input ( ) {
  String S = input ( ) ;
  if ( S . length ( ) % 2 == 0 ) {
    String S1 = S . substring ( 0 , S . length ( ) / 2 ) ;
    String S2 = S . substring ( S . length ( ) / 2 ) ;
    int i = S2 . length ( ) ;
    for ( i = 0 ;
    i < S . length ( ) / 2 ;
    i ++ ) {
      if ( S1 . charAt ( i ) == '*' || S2 . charAt ( i ) == '*' ) {
        continue ;
      }
      else if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
        continue ;
      }
      else {
        System . out . println ( "NO" ) ;
        break ;
      }
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  else {
    String S1 = S . substring ( 0 , S . length ( ) / 2 ) ;
    String S2 = S . substring ( S . length ( ) / 2 + 1 ) ;
    int i = S2 . length ( ) ;
    for ( i = 0 ;
    i < S . length ( ) / 2 ;
    i ++ ) {
      if ( S1 . charAt ( i ) == '*' || S2 . charAt ( i ) == '*' ) {
        continue ;
      }
      else if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
        continue ;
      }
      else {
        System . out . println ( "NO" ) ;
        break ;
      }
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  return S ;
}
