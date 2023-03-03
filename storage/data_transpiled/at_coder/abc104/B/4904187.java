public static String input ( ) {
  String S = input ( ) ;
  if ( ( S . charAt ( 0 ) == 'A' ) && ( S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( 'C' ) == 1 ) ) {
    int cnt = 0 ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      if ( ( ! ( 97 <= Character . digit ( S . charAt ( i ) , 16 ) && ( S . charAt ( i ) <= 122 ) ) ) {
        cnt ++ ;
      }
    }
    if ( ( cnt == 2 ) && ( S . charAt ( i ) == 'A' ) ) {
      System . out . println ( "AC" ) ;
    }
    else {
      System . out . println ( "WA" ) ;
    }
  }
  else {
    System . out . println ( "WA" ) ;
  }
  return S ;
}
