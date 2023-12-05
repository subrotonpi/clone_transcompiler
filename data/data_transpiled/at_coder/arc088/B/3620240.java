public static void main ( String [ ] args ) {
  char [ ] buf = input . toCharArray ( ) ;
  char [ ] S = buf ;
  int K = S . length / 2 ;
  char centerChar = S [ K ] ;
  while ( K < S . length ) {
    if ( S [ K ] == centerChar && S [ S . length - K - 1 ] == centerChar ) {
      K ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( K ) ;
}
