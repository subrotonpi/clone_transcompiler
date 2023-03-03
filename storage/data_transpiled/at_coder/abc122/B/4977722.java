public static int [ ] getChars ( ) {
  s = new Scanner ( input ) . next ( ) ;
  int [ ] L = new int [ s . length ( ) ] ;
  int cnt = 0 ;
  for ( char x : s ) {
    switch ( x ) {
      case 'A' : case 'C' : case 'G' : case 'T' : cnt ++ ;
      break ;
      default : L [ cnt ] = 0 ;
      cnt = 0 ;
    }
  }
  L [ cnt ] = 0 ;
  return L ;
}
