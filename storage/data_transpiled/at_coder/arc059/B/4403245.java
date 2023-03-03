public static int input ( ) {
  s = input ;
  s += "?" ;
  for ( int i = 0 ;
  i < s . length ( ) - 2 ;
  i ++ ) {
    if ( new HashSet < > ( Collections . singletonList ( s . substring ( i , i + 3 ) ) ) . size ( ) < 3 ) {
      if ( i == s . length ( ) - 3 ) System . out . println ( i + 1 ) ;
      else System . out . println ( i + 1 ) ;
      exit ( ) ;
    }
  }
  return - 1 ;
}
