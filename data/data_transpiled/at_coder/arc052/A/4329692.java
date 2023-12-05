public static String aNthClass ( String S ) {
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( Character . isDigit ( S . charAt ( i ) ) ) {
      return S . substring ( i , i + 2 ) ;
    }
    else if ( S . charAt ( i ) == '-' ) {
      return S ;
    }
  }
  return null ;
}
