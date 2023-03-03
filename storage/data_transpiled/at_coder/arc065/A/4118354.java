public static String input ( ) {
  int i = S . length ( ) ;
  String ans = "NO" ;
  while ( ( i = S . indexOf ( " " ) ) != - 1 ) {
    if ( ( i == 0 ) && ( i < S . length ( ) ) ) {
      ans = "YES" ;
      break ;
    }
    if ( ( i >= 5 ) && ( S . substring ( i - 5 , i ) . equals ( "dream" ) ) ) {
      i -= 5 ;
    }
    else if ( ( i >= 5 ) && ( S . substring ( i - 5 , i ) . equals ( "erase" ) ) ) {
      i -= 5 ;
    }
    else if ( ( i >= 6 ) && ( S . substring ( i - 6 , i ) . equals ( "eraser" ) ) ) {
      i -= 6 ;
    }
    else if ( ( i >= 7 ) && ( S . substring ( i - 7 , i ) . equals ( "dreamer" ) ) ) {
      i -= 7 ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
